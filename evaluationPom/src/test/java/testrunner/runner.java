package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "D:\\evaluationPom\\src\\test\\resources\\signUp.feature",
        glue = {"signUpPage"},
        monochrome = true
)
public class runner extends AbstractTestNGCucumberTests {
}
