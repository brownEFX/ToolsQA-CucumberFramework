package dataProvider;

import gherkin.deps.com.google.gson.Gson;
import managers.FileReaderManager;
import testDataTypes.Customer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;


public class JsonDataReader {

    private final String customerFilePath = FileReaderManager.getInstance().getConfigReader().getTestDataResourcePath() + "Customer.json";
    private List<Customer> customerList;


    // Here the responsibility of the constructor is to call getCustomerData() method only.
    public JsonDataReader(){
        customerList = getCustomerData();
    }

    // This is a private method with the logic implemented to read the Customer Json and save it to the class instance variable.
    // You should be creating more methods like this if you have more test data files like getPaymentOptions(), getProducts() etc.
    private List<Customer> getCustomerData() {
        Gson gson = new Gson();
        BufferedReader bufferReader = null;
        try {
            bufferReader = new BufferedReader(new FileReader(customerFilePath));
            Customer[] customers = gson.fromJson(bufferReader, Customer[].class);
            return Arrays.asList(customers);
        }
        catch(FileNotFoundException e) {
            throw new RuntimeException("Json file not found at path : " + customerFilePath);
        }
        finally {
            try {
                if(bufferReader != null) bufferReader.close();
            }
            catch (IOException ignore) {
            }
        }
    }

    // This just filter the information and return the specific customer to the test.
    public final Customer getCustomerByName(String customerName){
        return customerList.stream().filter(x -> x.firstName.equalsIgnoreCase(customerName)).findAny().get();
    }

    // Same method can also be written as:
/*    public final Customer getCustomerByName(String customerName){
        for(Customer customer : customerList) {
            if(customer.firstName.equalsIgnoreCase(customerName)) return customer;
        }
        return null;
    }*/
}
