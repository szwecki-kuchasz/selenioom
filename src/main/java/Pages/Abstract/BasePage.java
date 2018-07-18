package Pages.Abstract;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

abstract public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;

        PageFactory.initElements(this.driver, this);
    }

    public void clickElement(WebElement element){
        element.click();
    }

    public void fillElement(WebElement element, String value){
        element.clear();
        element.sendKeys(value);
    }

    public void submitForm(WebElement element){
        element.submit();
    }

    public boolean isElementDisplayed(WebElement element){
        return element != null && element.isDisplayed();
    }
}
