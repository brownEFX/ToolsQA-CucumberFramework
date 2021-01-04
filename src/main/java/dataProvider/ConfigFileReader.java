package dataProvider;

import enums.DriverType;
import enums.EnvironmentType;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

    private Properties properties;

    // propertyFilePath : This is just a String variable which holds the information of the config file path.
    private final String propertyFilePath = "configs//Configuration.properties";

    public ConfigFileReader() {

        BufferedReader reader;
        try {
            // Reads text from a character-input stream,
            // buffering characters to provide for the efficient reading of characters, arrays, and lines.
            reader = new BufferedReader(new FileReader(propertyFilePath));

            // The Properties class represents a persistent set of properties.
            // The Properties can be saved to a stream or loaded from a stream.
            // Each key and its corresponding value in the property list is a string.
            properties = new Properties();
            try {
                //Reads a property list (key and element pairs) from input character stream in a simple line-oriented format.
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
        }
    }

    // Properties object gives us a .getProperty method which takes the Key of the property as a parameter
    // and return the Value of the matched key from the .properties file.
    // If the properties file does not have the specified key, it returns the null.
    // This is why we have put the null check and in case of null we like to
    // throw an exception to stop the test with the stack trace information.
    public String getDriverPath() {
        String driverPath = properties.getProperty("driverPath");
        if (driverPath != null)
            return driverPath;
        else throw new RuntimeException("Driver Path not specified in the Configuration.properties file.");
    }

    public long getImplicitlyWait() {
        String implicitlyWait = properties.getProperty("implicitlyWait");
        if(implicitlyWait != null) {
            try{
                return Long.parseLong(implicitlyWait);
            }
            catch(NumberFormatException e) {
                throw new RuntimeException("Not able to parse value : " + implicitlyWait + " in to Long");
            }
        }
        return 30;
    }

    public String getApplicationUrl() {
        String url = properties.getProperty("url");
        if(url != null)
            return url;
        else throw new RuntimeException("url not specified in the Configuration.properties file.");
    }
    // Default value is returned as DriverType.Chrome in case of Null.
    // Exception is thrown if the value does not match with anything.
    public DriverType getBrowser() {
        String browserName = properties.getProperty("browser");
        if(browserName == null || browserName.equals("chrome")) return DriverType.CHROME;
        else if(browserName.equalsIgnoreCase("firefox")) return DriverType.FIREFOX;
        else if(browserName.equals("iexplorer")) return DriverType.INTERNETEXPLORER;
        else throw new RuntimeException("Browser Name Key value in Configuration.properties is not matched : " + browserName);
    }

    // EnvironmentType.Local is returned in case of Null and if the value is equal to Local.
    // Which means that in case of missing environment property, execution will be carried on local machine.
    public EnvironmentType getEnvironment() {
        String environmentName = properties.getProperty("environment");
        if(environmentName == null || environmentName.equalsIgnoreCase("local")) return EnvironmentType.LOCAL;
        else if(environmentName.equals("remote")) return EnvironmentType.REMOTE;
        else throw new RuntimeException("Environment Type Key value in Configuration.properties is not matched : " + environmentName);
    }

    // Retrieve the property using getProperty method of Properties class.
    // Null check is performed and in case of null by default value is returned as true.
    // In case of not null, String value is parsed to Boolean.
    public Boolean getBrowserWindowSize() {
        String windowSize = properties.getProperty("windowMaximize");
        if(windowSize != null) return Boolean.valueOf(windowSize);
        return true;
    }

    // Read method for the JSon file to get the value saved in the config file for key testDataResourcePath.
    // We throw the exception in case of null value returned from getProperty() method or return the value if it is not null.
    public String getTestDataResourcePath(){
        String testDataResourcePath = properties.getProperty("testDataResourcePath");
        if(testDataResourcePath!= null)
            return testDataResourcePath;
        else throw new RuntimeException("Test Data Resource Path not specified in the Configuration.properties file for the Key:testDataResourcePath");
    }
}