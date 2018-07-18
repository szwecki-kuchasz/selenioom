package Utils;

import Utils.Abstract.FrameworkCore;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomScreenshot extends FrameworkCore {

    public void makeScreenshot(String methodName){
        File screenshot = ((TakesScreenshot)driver)
                .getScreenshotAs(OutputType.FILE);
        try {

            SimpleDateFormat formatter;
            formatter = new SimpleDateFormat(baseProperties.getScreenshotDateFormat());
            FileUtils.copyFile(screenshot, new File(
                    fileHelper.getMainPath() +
                            baseProperties.getScreenshotsPath() +
                            methodName + "_" + formatter.format(new Date()) + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
