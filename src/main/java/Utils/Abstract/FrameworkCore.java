package Utils.Abstract;

import Models.BaseProperties;
import Pages.Abstract.BasePage;
import Utils.CustomScreenshot;
import Utils.DriverFactory;
import Utils.FileHelper;
import Utils.PropertiesReader;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

abstract public class FrameworkCore {

    protected static BaseProperties baseProperties;
    protected static FileHelper fileHelper;
    protected static WebDriver driver;

    public FrameworkCore(){
        fileHelper = new FileHelper();
    }

}
