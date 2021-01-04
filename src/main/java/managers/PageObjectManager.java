package managers;

import org.openqa.selenium.WebDriver;
import pageObjects.CartPage;
import pageObjects.CheckoutPage;
import pageObjects.HomePage;
import pageObjects.ProductListingPage;

public class PageObjectManager {
    private WebDriver driver;
    private ProductListingPage productListingPage;
    private CartPage cartPage;
    private HomePage homePage;
    private CheckoutPage checkoutPage;
    //private ConfirmationPage confirmationPage;

    //This constructor is asking for parameter of type WebDriver.
    // To create an object of the Pages, this class requires a driver. N
    // Whoever creates the object of this class needs to provide the driver like :
        //PageObjectManager pageObjectManager = new PageObjectManager(driver);

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    //Page Object Creation Method
    //To create an Object of Page Class only if the object is null.
    //To supply the already created object if it is not null
    public HomePage getHomePage(){
        return (homePage == null) ? homePage = new HomePage(driver) : homePage;
    }

    public ProductListingPage getProductListingPage() {
        return (productListingPage == null) ? productListingPage = new ProductListingPage(driver) : productListingPage;
    }

    public CartPage getCartPage() {
        return (cartPage == null) ? cartPage = new CartPage(driver) : cartPage;
    }

    public CheckoutPage getCheckoutPage() {
        return (checkoutPage == null) ? checkoutPage = new CheckoutPage(driver) : checkoutPage;
    }
}

