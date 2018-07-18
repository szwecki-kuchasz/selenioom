package Pages;

import Pages.Abstract.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddEnvironPage extends BasePage {

    @FindBy(id = "name")
    WebElement environName;
    @FindBy(id = "description")
    WebElement environDescription;
    @FindBy(id = "save")
    WebElement saveBtn;

    public AddEnvironPage(WebDriver driver) {
        super(driver);
    }

    public EnvironsPage fillData(String name, String description) {
        fillElement(environName, name);
        fillElement(environDescription, description);
        submitForm(saveBtn);
        return new EnvironsPage(driver);
    }


}
