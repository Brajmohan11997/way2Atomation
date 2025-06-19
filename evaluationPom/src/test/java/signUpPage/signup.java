package signUpPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.NoSuchElementException;

public class signup {
    private WebDriver driver;
    private By enterFirstName = By.xpath("(//input[@name=\"name\"])[1]");
    private By enterLastName = By.xpath("(//input[@type=\"text\"])[2]");
    private By clickCheckBox = By.xpath(("//input[@type=\"checkbox\"]"));
    private By enterPhoneNo = By.xpath("(//input[@name=\"phone\"])[1]");
    private By enterUserName = By.xpath("(//input[@name=\"username\"])[1]");
    private By enterEmailId = By.xpath("(//input[@name=\"email\"])[1]");
    private By enterText = By.tagName("textarea");
    private By enterPasswrod = By.xpath("(//input[@name=\"password\"])[1]");
    private By enterc_password = By.xpath("(//input[@name=\"c_password\"])[1]");
    private By submitButton = By.xpath("//input[@value=\"submit\"]");
    private By hobies = By.xpath("//input[@type=\"checkbox\"]");

    public signup(WebDriver driver) {
        this.driver = driver;
    }

    public void EnterfirstName(String f_Name){
        driver.findElement(enterFirstName).sendKeys(f_Name);
    }

    public void EnterlasttName(String l_Name){
        driver.findElement(enterLastName).sendKeys(l_Name);

    }

    public void EnterHobies(String ValueToSelect){
        try {
            List<WebElement> hobbyCheckBoxs = driver.findElements(hobies);
            for (WebElement hobby : hobbyCheckBoxs) {
                if (hobby.getAttribute("name").equals(ValueToSelect)) {
                    hobby.click();
                    break;
                }
            }
        }
        catch(NoSuchElementException e){
            System.out.println("checkBox not Found: "+ e.getMessage());
        }

    }

    public void EnterPhone(String p_number){
        driver.findElement(enterPhoneNo).sendKeys(p_number);
    }

    public void EnteruserName(String u_Name){
        driver.findElement(enterUserName).sendKeys(u_Name);
    }

    public void EnterEmail(String email){
        driver.findElement(enterEmailId).sendKeys(email);
    }

    public void EnterText(String text){
        driver.findElement(enterText).sendKeys(text);
    }

    public void Enterpassword(String password){
        driver.findElement(enterPasswrod).sendKeys(password);
    }

    public void Enterc_password(String c_password){
        driver.findElement(enterc_password).sendKeys(c_password);
    }

    public void clickButton(){
        driver.findElement(submitButton).click();
    }
}
