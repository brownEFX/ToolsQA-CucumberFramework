/*
package stepDefinitions;

import dataProvider.ConfigFileReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import managers.FileReaderManager;
import managers.PageObjectManager;
import managers.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.CartPage;
import pageObjects.CheckoutPage;
import pageObjects.HomePage;
import pageObjects.ProductListingPage;

import java.io.FileReader;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;
import static javafx.beans.binding.Bindings.select;

public class Steps {
    WebDriver driver;
    HomePage homePage;
    ProductListingPage productListingPage;
    CartPage cartPage;
    CheckoutPage checkoutPage;
    PageObjectManager pageObjectManager;
    WebDriverManager webDriverManager;

    @Given("customer is in the Home Page")
    public void customer_is_in_the_home_page() {
        webDriverManager = new WebDriverManager();
        driver = webDriverManager.getDriver();
        pageObjectManager = new PageObjectManager(driver);
        homePage = pageObjectManager.getHomePage();
        homePage.navigateTo_HomePage();
    }

    //We just brought page object concept in to the step definition file and called their methods.
    @When("customer searches for {string}")
    public void customer_searches_for(String product) {
        homePage.perform_Search(product);
    }

    @When("chooses to buy the first item")
    public void chooses_to_buy_the_first_item() {
        // Assign the duty of page creation to Page Object Manager
        productListingPage = pageObjectManager.getProductListingPage();
        productListingPage.select_Product(0);
        productListingPage.clickOn_AddToCart();
    }

    @When("clicks proceed to checkout to go to checkout page")
    public void clicks_proceed_to_checkout_to_go_to_checkout_page() {
        //Proceed to checkout
        cartPage = pageObjectManager.getCartPage();
        cartPage.clickOn_Cart();
        cartPage.clickOn_ContinueToCheckout();
    }

    @When("enter personal details on checkout page")
    public void enter_personal_details_on_checkout_page() throws InterruptedException  {
        //Enter billing details
        checkoutPage = pageObjectManager.getCheckoutPage();
        checkoutPage.fill_PersonalDetails();
    }

    @When("places order")
    public void places_order() throws InterruptedException{
        //CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.check_TermsAndCondition(true);
        checkoutPage.clickOn_PlaceOrder();
        webDriverManager.closeDriver();
    }

}
*/
