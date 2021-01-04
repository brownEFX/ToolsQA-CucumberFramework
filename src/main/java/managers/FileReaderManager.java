package managers;

import dataProvider.ConfigFileReader;
import dataProvider.JsonDataReader;

public class FileReaderManager {

    //FileReaderManager class maintains a static reference to its own instance and
    //returns that reference from the static getInstance() method.
    private static FileReaderManager fileReaderManager = new FileReaderManager();

    private static ConfigFileReader configFileReader;

    private static JsonDataReader jsonDataReader;

    //FileReaderManager implements a private constructor so clients cannot instantiate FileReaderManager instances.
    private FileReaderManager() {
    }

    public static FileReaderManager getInstance( ) {
        return fileReaderManager;
    }

    //getConfigReader() method returns the instance of the ConfigFileReader but this method is not static.
    //So that client has to use the getInstance() method to access other public methods of the FileReaderManager
    //like FileReaderManager.getInstance().getConfigReader()
    public ConfigFileReader getConfigReader() {
        return (configFileReader == null) ? new ConfigFileReader() : configFileReader;
    }
    // We have a FileReaderManager singleton class over all the readers,
    // so we need to make an entry of JsonDataReader in that as well.
    public JsonDataReader getJsonReader(){
        return (jsonDataReader == null) ? new JsonDataReader() : jsonDataReader;
    }
}
