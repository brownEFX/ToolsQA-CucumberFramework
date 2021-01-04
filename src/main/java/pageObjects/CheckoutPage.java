package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import testDataTypes.Customer;

import java.util.List;

//Constructor: initiate page factory
//Use PageFactory.initElements(driver, this), not PageFactory.initElements(driver, checkoutPage ); to cover all page objects
public class CheckoutPage {
    public CheckoutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //@FindBy Annotation to find the elements in the page using By strategy
    @FindBy(how = How.CSS, using = "#billing_first_name")
    private WebElement txtbx_FirstName;
    @FindBy(how = How.CSS, using = "#billing_last_name")
    private WebElement txtbx_LastName;
    @FindBy(how = How.CSS, using = "#billing_country_field .select2-arrow")
    private WebElement drpdwn_CountryDropDownArrow;
    @FindAll(@FindBy(how = How.CSS, using = "#select2-drop ul li"))
    private List<WebElement> country_List;
    @FindBy(how = How.CSS, using = "#billing_address_1")
    private WebElement txtbx_Address;
    @FindBy(how = How.CSS, using = "#billing_city")
    private WebElement txtbx_City;
    @FindBy(how = How.CSS, using = "#billing_state_field .select2-arrow")
    private WebElement drpdwn_provinceDropDownArrow;
    @FindAll(@FindBy(how = How.CSS, using = "#select2-drop ul li"))
    private List<WebElement> province_List;
    @FindBy(how = How.CSS, using = "#billing_postcode")
    private WebElement txtbx_PostCode;
    @FindBy(how = How.CSS, using = "#billing_phone")
    private WebElement txtbx_Phone;
    @FindBy(how = How.CSS, using = "#billing_email")
    private WebElement txtbx_Email;
    @FindBy(how = How.CSS, using = "#terms.input-checkbox")
    private WebElement chkbx_AcceptTermsAndCondition;
    @FindBy(how = How.CSS, using = "#place_order")
    private WebElement btn_PlaceOrder;

    public void enter_Name(String name) {
        txtbx_FirstName.sendKeys(name);
    }

    public void enter_LastName(String lastName) {
        txtbx_LastName.sendKeys(lastName);
    }

    public void select_Country(String countryName) {
        drpdwn_CountryDropDownArrow.click();
        try { Thread.sleep(2000);}
        catch (InterruptedException e) {}

        for(WebElement country : country_List){
            if(country.getText().equals(countryName)) {
                country.click();
                try { Thread.sleep(3000);}
                catch (InterruptedException e) {}
                break;
            }
        }
    }

    public void select_Province(String provinceName) {
        drpdwn_provinceDropDownArrow.click();
        try { Thread.sleep(2000);}
        catch (InterruptedException e) {

        }

        for(WebElement province : province_List){
            if(province.getText().equals(provinceName)) {
                province.click();
                try { Thread.sleep(3000);}
                catch (InterruptedException e) {}
                break;
            }
        }
    }

    public void enter_Email(String email) {
        txtbx_Email.sendKeys(email);
    }

    public void enter_Phone(String phone) {
        txtbx_Phone.sendKeys(phone);
    }

    public void enter_Address(String address) {
        txtbx_Address.sendKeys(address);
    }

    public void enter_City(String city) {
        txtbx_City.sendKeys(city);
    }

    public void enter_PostCode(String postCode) {
        txtbx_PostCode.sendKeys(postCode);
    }

    public void check_TermsAndCondition(boolean value) {
        if(value) chkbx_AcceptTermsAndCondition.click();
    }

    public void clickOn_PlaceOrder() {
        btn_PlaceOrder.submit();
    }

    //Wrap re-usable actions in the PageObject class itself to Optimize Page Object Model and improve test code.
    //The code for entering personal details will be called again and again in every test script.
    //Wrap that action into a function and use it as many time as required.
    public void fill_PersonalDetails(Customer customer) {
        enter_Name(customer.firstName);
        enter_LastName(customer.lastName);
        enter_Phone(customer.phoneNumber.mob);
        enter_Email(customer.emailAddress);
        enter_City(customer.address.city);
        enter_Address(customer.address.streetAddress);
        enter_PostCode(customer.address.postCode);
        select_Country(customer.address.country);
        select_Province(customer.address.county);
    }
}

