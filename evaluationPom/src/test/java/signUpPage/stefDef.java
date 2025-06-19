package signUpPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import signUpPage.signup;

public class stefDef {
    private WebDriver driver;
    private signup Signup;

    @Given("launch the browser")
    public void launch_the_browser(){
        driver = new ChromeDriver();
        driver.get("https://way2automation.com/way2auto_jquery/registration.php#load_box");
        Signup = new signup(driver);
        driver.manage().window().maximize();
    }

    @When("enter the valid details")
    public void enter_the_valid_details(){
        Signup.EnterfirstName("John");
        Signup.EnterlasttName("Doe");
        Signup.EnterHobies("hobby");
        Signup.EnterPhone("1234567890");
        Signup.EnteruserName("john12");
        Signup.EnterEmail("john@gmail.com");
        Signup.EnterText("john Doe");
        Signup.Enterpassword("john123");
        Signup.Enterc_password("john123");

    }

    @And("click submit button")
    public void click_submit_button(){
        Signup.clickButton();
    }

    @Then("verify page")
    public void verify_page() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
