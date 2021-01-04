package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageObjects.HomePage;

public class HomePageSteps {
    TestContext testContext;
    HomePage homePage;

    public HomePageSteps(TestContext context) {
        testContext = context;
        homePage = testContext.getPageObjectManager().getHomePage();
    }

    @Given("customer is in the Home Page")
    public void customer_is_in_the_home_page() {
        homePage.navigateTo_HomePage();
    }

    //We just brought page object concept in to the step definition file and called their methods.

    @When("customer searches for \"([^\"]*)\"$")
    //@When("customer searches for {string}")
    public void customer_searches_for(String product) {
        homePage.perform_Search(product);
    }
}
