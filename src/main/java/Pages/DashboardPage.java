package Pages;

import Pages.Abstract.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends BasePage {

    @FindBy(xpath = "//html/body/header/div[2]/div[2]/a/span")
    WebElement logoutButton;

    @FindBy(xpath = "//html/body/aside/div/ul/li[4]/a")
    WebElement environments;

    public DashboardPage(WebDriver driver){
        super(driver);
    }

    public boolean isLogoutButtonDisplayed(){
        return isElementDisplayed(logoutButton);
    }

    public EnvironsPage gotoEnvironments() {
        environments.click();
        return new EnvironsPage(driver);
    }
}
