/*
package seleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class E2E_Tests2 {

    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demowebshop.tricentis.com/");

        //driver.navigate().to("https://shop.demoqa.com/?s= " + "dress" + "&post_type=product");

        //List<WebElement> items = driver.findElements(By.cssSelector(".noo-product-inner"));
        //items.get(0).click();

        WebElement searchField = driver.findElement(By.xpath("//*[@id='small-searchterms']"));
        searchField.sendKeys("Men's Wrinkle Free Long Sleeve");

        WebElement searchBtn = driver.findElement(By.xpath("//input[contains(@class , \"button-1 search\")]"));
        searchBtn.click();

        WebElement selectProduct = driver.findElement(By.xpath("//h2/a"));
        selectProduct.click();

        WebElement sizeDropdown = driver.findElement(By.xpath("//*[@id=\"product_attribute_10_7_36\"]"));
        sizeDropdown.click();

        By size = (By.xpath("//option[@value= \"110\"]"));
        Select select = new Select(driver.findElement(size));;
        select.selectByValue("Medium");

        WebElement addToWishlist = driver.findElement(By.xpath("//*[@id = \"add-to-cart-button-10\"]"));
        addToWishlist.click();

        WebElement addToCart = driver.findElement(By.xpath("//*[@id = \"add-to-wishlist-button-10\"]"));
        addToCart.click();

        WebElement shoppingCartLink = driver.findElement(By.xpath("//*[@id=\"topcartlink\"]"));
        shoppingCartLink.click();

        WebElement acceptTermsOfService = driver.findElement(By.id("termsofservice"));
        acceptTermsOfService.click();

        //WebElement goToCartBtn = driver.findElement(By.xpath("//*[@id=\"flyout-cart\"]/div/div[4]/input"));
        //goToCartBtn.click();

        WebElement checkout = driver.findElement(By.id("checkout"));
        checkout.click();

        WebElement checkoutAsGuest = driver.findElement(By.xpath("//*[@value =\"Checkout as Guest\"]"));
        checkoutAsGuest.click();

        WebElement billingAddressDropdown = driver.findElement(By.id("billing-address-select"));
        billingAddressDropdown.click();

        Select selectBillingAddress = new Select(driver.findElement(By.xpath("//*[@id=\"billing-address-select\"]/option[2]")));
        selectBillingAddress.selectByValue("New Address");

        Thread.sleep(5000);


        WebElement firstName = driver.findElement(By.id("#BillingNewAddress_FirstName"));
        firstName.sendKeys("Brown");

        WebElement lastName = driver.findElement(By.id("#BillingNewAddress_LastName"));
        lastName.sendKeys("Native");

        WebElement emailAddress = driver.findElement(By.id("#BillingNewAddress_Email"));
        emailAddress.sendKeys("eg@example.com");

        WebElement countryDropDown = driver.findElement(By.id("#BillingNewAddress_CountryId"));
        countryDropDown.click();

        Thread.sleep(2000);

        Select billingCountry = new Select(driver.findElement(By.xpath("//option[@value=\"71\"]")));
        selectBillingAddress.selectByValue("South Africa");

        List<WebElement> countryList = driver.findElements(By.cssSelector("#select2-drop ul li"));
        for(WebElement country : countryList){
            if(country.getText().equals("SouthA")) {
                country.click();
                Thread.sleep(3000);
                break;
            }
        }


        WebElement city = driver.findElement(By.id("#BillingNewAddress_City"));
        city.sendKeys("Jozi");

        WebElement address = driver.findElement(By.id("#BillingNewAddress_Address1"));
        address.sendKeys("411 Church");

        WebElement postalCode = driver.findElement(By.id("#BillingNewAddress_ZipPostalCode"));
        postalCode.sendKeys("1818");

        WebElement phone = driver.findElement(By.id("#BillingNewAddress_PhoneNumber"));
        phone.sendKeys("0820830840");

        WebElement continueBtn = driver.findElement(By.xpath("//input[contains(@onclick, \"Billing.save()\")]"));

        WebElement inStorePickUp = driver.findElement(By.id("#PickUpInStore"));
        inStorePickUp.click();

        WebElement continueBtn2 = driver.findElement(By.xpath("//input[contains(@onclick, \"Shipping.save()\")]"));
        continueBtn2.click();

        WebElement checkMoneyOrder = driver.findElement(By.id("paymentmethod_1"));

        WebElement continueBtn3 = driver.findElement(By.xpath("//input[contains(@onclick, \"PaymentMethod.save()\")]"));
        continueBtn3.click();

        WebElement continueBtn4 = driver.findElement(By.xpath("//input[contains(@onclick, \"PaymentInfo.save()\")]"));
        continueBtn4.click();

        WebElement confirmBtn = driver.findElement(By.xpath("//input[contains(@onclick, \"PaymentInfo.save()\")]"));
        confirmBtn.click();


        Thread.sleep(3000);

        driver.quit();

    }
}

*/
