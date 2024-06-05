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
    @FindBy(xpath = "//*[@id=\"actionWithoutDueSummaryContainer\"]/span[1]/span/span[2]/span/span[2]")
    WebElement leaveLink;

    public void clickOnEmployeeListLink(){
        clickOnBtn(employeeListLink);
    }
    public void clickOnLeaveLink(){
        clickOnBtn(leaveLink);
    }
}
