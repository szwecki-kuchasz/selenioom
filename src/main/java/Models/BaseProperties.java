package Models;

public class BaseProperties {
    private String baseURL;
    private String baseAdminEmail;
    private String baseAdminPassword;

    private String driversPath;
    private String screenshotsPath;

    private String screenshotDateFormat;

    private String geckoDriverName;
    private String chromeDriverName;

    public String getBaseURL() {
        return baseURL;
    }

    public void setBaseURL(String baseURL) {
        this.baseURL = baseURL;
    }

    public String getBaseAdminEmail() {
        return baseAdminEmail;
    }

    public void setBaseAdminEmail(String baseAdminEmail) {
        this.baseAdminEmail = baseAdminEmail;
    }

    public String getBaseAdminPassword() {
        return baseAdminPassword;
    }

    public void setBaseAdminPassword(String baseAdminPassword) {
        this.baseAdminPassword = baseAdminPassword;
    }

    public String getDriversPath() {
        return driversPath;
    }

    public void setDriversPath(String driversPath) {
        this.driversPath = driversPath;
    }

    public String getScreenshotsPath() {
        return screenshotsPath;
    }

    public void setScreenshotsPath(String screenshotsPath) {
        this.screenshotsPath = screenshotsPath;
    }

    public String getScreenshotDateFormat() {
        return screenshotDateFormat;
    }

    public void setScreenshotDateFormat(String screenshotDateFormat) {
        this.screenshotDateFormat = screenshotDateFormat;
    }
    public String getGeckoDriverName() {
        return geckoDriverName;
    }

    public void setGeckoDriverName(String geckoDriverName) {
        this.geckoDriverName = geckoDriverName;
    }

    public String getChromeDriverName() {
        return chromeDriverName;
    }

    public void setChromeDriverName(String chromeDriverName) {
        this.chromeDriverName = chromeDriverName;
    }
}
