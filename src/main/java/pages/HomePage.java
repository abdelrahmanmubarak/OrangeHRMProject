package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{
    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "top-level-menu-item")
    WebElement employeeListLink;
    @FindBy(xpath = "//span[@class='primary-content-container']//span[1]//span[1]//div[1]//span[1]//span[1]//img[1]")
    WebElement leaveLink;

    public void clickOnEmployeeListLink(){
        clickOnBtn(employeeListLink);
    }
    public void clickOnLeaveLink(){
        clickOnBtn(leaveLink);
    }
}
