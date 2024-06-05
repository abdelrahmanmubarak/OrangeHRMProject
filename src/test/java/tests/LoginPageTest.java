package tests;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginPageTest extends TestBase{
    String userName = "Admin";
    String password = "HsGz2@3XhX";
    LoginPage loginPageObject;
    HomePage homePageObj;

    @Test
    public void userCanLoginToSystem() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();

        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        loginPageObject = new LoginPage(driver);
        loginPageObject.logInProcess(userName,password);
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        Thread.sleep(10000);
        homePageObj = new HomePage(driver);
        homePageObj.clickOnLeaveLink();
    }
}
