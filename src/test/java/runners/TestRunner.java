package runners;
//Create a JUnit Test Runner

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/functionalTests",
    //Mention stepDefinitions path to ensure that TestRunner file is able to find the steps files.
    glue = {"stepDefinitions"}
)

public class TestRunner {
}
