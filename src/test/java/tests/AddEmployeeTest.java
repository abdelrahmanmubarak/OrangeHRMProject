package tests;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.EmployeeListPage;
import pages.HomePage;
import pages.LoginPage;

import java.time.Duration;

public class AddEmployeeTest extends TestBase{
    String username = "Admin";
    String password = "HsGz2@3XhX";
        HomePage homeObject;
        LoginPage loginPageObject;
        EmployeeListPage employeeListPageObject;

    @Test
    public void userCanAddNewEmployee(){
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        loginPageObject = new LoginPage(driver);
        loginPageObject.logInProcess(username, password);
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        homeObject = new HomePage(driver);
        homeObject.clickOnEmployeeListLink();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        employeeListPageObject = new EmployeeListPage(driver);
        employeeListPageObject.addNewEmployee();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);



    }
}
