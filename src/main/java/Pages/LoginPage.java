package Pages;

import Pages.Abstract.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    @FindBy(id = "email")
    WebElement emailField;

    @FindBy(id = "password")
    WebElement passwordField;

    @FindBy(id = "login")
    WebElement loginButton;

    public LoginPage (WebDriver driver){
        super(driver);
    }

    public LoginPage fillLoginForm(String email, String password){
        fillElement(emailField, email);
        fillElement(passwordField, password);
        return this;
    }

    public DashboardPage submitLoginFormByClickLoginButton(){
        clickElement(loginButton);
        return new DashboardPage(driver);
    }

    public DashboardPage submitLoginForm(){
        submitForm(passwordField);
        return new DashboardPage(driver);
    }
}
