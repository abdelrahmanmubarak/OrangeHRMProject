package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployeeListPage extends PageBase{
    public EmployeeListPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "addEmployeeButton")
    WebElement addNewEmployeeBtn;

    public void addNewEmployee(){
        clickOnBtn(addNewEmployeeBtn);

    }

}
