package Tests;

import AbstractTests.BaseTest;
import Pages.DashboardPage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Date;

public class LoginTest extends BaseTest {

    @BeforeClass
    public void setUpClass(){
        driver.get(baseProperties.getBaseURL());
    }

    @Test
    public void successLoginTest(){
        logger2 = reports.startTest("kuku");

        LoginPage loginPage = new LoginPage(driver);
        DashboardPage dashboardPage = loginPage
                .fillLoginForm(
                        baseProperties.getBaseAdminEmail(),
                        baseProperties.getBaseAdminPassword())
                .submitLoginFormByClickLoginButton();
        Assert.assertTrue(dashboardPage.isLogoutButtonDisplayed());
        dashboardPage.gotoEnvironments()
                .addEnviron().fillData("DO NOT REPEAT YOURSELF " + new Date().getTime(), "No");
    }

    // Logowanie nieudane
}
