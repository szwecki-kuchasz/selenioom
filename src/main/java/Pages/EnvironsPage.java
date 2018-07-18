package Pages;

import Pages.Abstract.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnvironsPage extends BasePage {

    @FindBy(xpath = "//html/body/div[1]/section/article/nav/ul/li/a")
    WebElement addEnvironBtn;

    public EnvironsPage(WebDriver driver) {
        super(driver);
    }

    public AddEnvironPage addEnviron() {
        addEnvironBtn.click();
        return new AddEnvironPage(driver);
    }

}
