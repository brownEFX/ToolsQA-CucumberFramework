/*
package seleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class E2E_Tests {

    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://shop.demoqa.com/");

        //driver.navigate().to("https://shop.demoqa.com/?s= " + "dress" + "&post_type=product");

        //List<WebElement> items = driver.findElements(By.cssSelector(".noo-product-inner"));
        //items.get(0).click();

        WebElement addToCart = driver.findElement(By.cssSelector("button.single_add_to_cart_button"));
        addToCart.click();

        WebElement cart = driver.findElement(By.cssSelector(".cart-button"));
        cart.click();

        WebElement continueToCheckout = driver.findElement(By.cssSelector(".checkout-button.alt"));
        continueToCheckout.click();

        Thread.sleep(5000);
        WebElement firstName = driver.findElement(By.cssSelector("#billing_first_name"));
        firstName.sendKeys("Karabo");

        WebElement lastName = driver.findElement(By.cssSelector("#billing_last_name"));
        lastName.sendKeys("Tabane");

        WebElement emailAddress = driver.findElement(By.cssSelector("#billing_email"));
        emailAddress.sendKeys("kabot@gmail.com");

        WebElement phone = driver.findElement(By.cssSelector("#billing_phone"));
        phone.sendKeys("0820830840");

        WebElement countryDropDown = driver.findElement(By.cssSelector("#billing_country_field .select2-arrow"));
        countryDropDown.click();
        Thread.sleep(2000);

        List<WebElement> countryList = driver.findElements(By.cssSelector("#select2-drop ul li"));
        for(WebElement country : countryList){
            if(country.getText().equals("SouthA")) {
                country.click();
                Thread.sleep(3000);
                break;
            }
        }

        WebElement city = driver.findElement(By.cssSelector("#billing_city"));
        city.sendKeys("Jozi");

        WebElement address = driver.findElement(By.cssSelector("#billing_address_1"));
        address.sendKeys("411 Church");

        WebElement postcode = driver.findElement(By.cssSelector("#billing_postcode"));
        postcode.sendKeys("1685");

        WebElement shipToDifferetAddress = driver.findElement(By.cssSelector("#ship-to-different-address-checkbox"));
        shipToDifferetAddress.click();
        Thread.sleep(3000);

        List<WebElement> paymentMethod = driver.findElements(By.cssSelector("ul.wc_payment_methods li"));
        paymentMethod.get(0).click();

        WebElement acceptTandCs = driver.findElement(By.cssSelector("#terms.input-checkbox"));
        acceptTandCs.click();

        WebElement placeOrder = driver.findElement(By.cssSelector("#place_order"));
        placeOrder.submit();

        driver.quit();

    }
}

*/
