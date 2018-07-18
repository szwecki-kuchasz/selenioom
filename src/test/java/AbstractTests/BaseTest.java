package AbstractTests;

import Models.BaseProperties;
import Utils.Abstract.FrameworkCore;
import Utils.CustomScreenshot;

import Utils.DriverFactory;
import Utils.PropertiesReader;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.util.concurrent.TimeUnit;

abstract public class BaseTest extends FrameworkCore {


    protected static CustomScreenshot customScreenshot;
    protected static Logger log;

    public static ExtentReports reports;
    public static ExtentTest logger2;

    @BeforeTest
    @Parameters ({"browserType", "propertiesFile"})
    public void setUpSuite(String browserType, String propertiesFile){
        PropertiesReader propertiesReader = new PropertiesReader();
        baseProperties = propertiesReader.readProperties(propertiesFile);

        DriverFactory driverFactory = new DriverFactory();
        driver = driverFactory.getDriver(browserType);

        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.manage().window().maximize();

        customScreenshot = new CustomScreenshot();
        log = Logger.getLogger(this.getClass().getName());

        reports = new ExtentReports(fileHelper.getMainPath()+"reports/report.html", true);
        reports.addSystemInfo("typ testów", "Regresja")
            .addSystemInfo("Poogda", "słonecznie")
            .addSystemInfo("Czy ok", "ok");

        reports.loadConfig(fileHelper.getResourceFile("report.xml"));
    }

    @AfterSuite
    public void tearDownSuite(){
        driver.quit();
    }

    @AfterTest
    public void teardownTest() {
        reports.flush();
        reports.close();
    }

    @AfterMethod
    public void tearDownMethod(ITestResult result){
        String methodName = result.getMethod().getMethodName();
        if ( result.getStatus() == ITestResult.FAILURE || true) {
            customScreenshot.makeScreenshot(methodName);
            log.error(methodName + " - FAIL");
        } else if ( result.getStatus() == ITestResult.SUCCESS ){
            log.info(methodName + " - SUCCESS");
        }
    }
}
