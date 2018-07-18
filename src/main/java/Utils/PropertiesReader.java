package Utils;

import Models.BaseProperties;
import Utils.Abstract.FrameworkCore;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesReader {

    public BaseProperties readProperties(String propertiesFile) {
        BaseProperties baseProperties = new BaseProperties();

        FileHelper fileHelper = new FileHelper();

        Properties prop = new Properties();
        InputStream input = null;

        try {
            input = new FileInputStream(fileHelper.getPathToResourceFile(propertiesFile));
            prop.load(input);

            baseProperties.setBaseURL(prop.getProperty("baseUrl"));
            baseProperties.setBaseAdminEmail(prop.getProperty("baseAdminEmail"));
            baseProperties.setBaseAdminPassword(prop.getProperty("baseAdminPassword"));

            baseProperties.setDriversPath(prop.getProperty("driversPath"));
            baseProperties.setScreenshotsPath(prop.getProperty("screenshotsPath"));
            baseProperties.setScreenshotDateFormat(prop.getProperty("screenshotDateFormat"));

            baseProperties.setGeckoDriverName(prop.getProperty("geckoDriverName"));
            baseProperties.setChromeDriverName(prop.getProperty("chromeDriverName"));

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                 } catch (IOException e) {
                    e.printStackTrace();
                }
                return baseProperties;
            }
        }
        return new BaseProperties();
    }
}

