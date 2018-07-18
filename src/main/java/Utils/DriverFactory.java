package Utils;

import Utils.Abstract.FrameworkCore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory extends FrameworkCore {

    public WebDriver getDriver(String browserType) {
        if (browserType.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver",
                    fileHelper.getPathToResourceFile(
                            baseProperties.getDriversPath() +
                                    baseProperties.getGeckoDriverName()));
            return new FirefoxDriver();
        } else if (browserType.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver",
                    fileHelper.getPathToResourceFile(
                            baseProperties.getDriversPath() +
                                    baseProperties.getChromeDriverName()));
            return new ChromeDriver();
        } else { // DEFAULT
            System.setProperty("webdriver.gecko.driver",
                    fileHelper.getPathToResourceFile(
                            baseProperties.getDriversPath() +
                                    baseProperties.getGeckoDriverName()));
            return new FirefoxDriver();
        }
    }
}
