package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "txtUsername")
    WebElement userNameTxt;
    @FindBy(id = "txtPassword")
    WebElement passwordTxt;
    @FindBy(css = "button[type='submit']")
    WebElement loginBtn;

    public void logInProcess(String userName,String password){
        setTextInTxtBox(userNameTxt,userName);
        setTextInTxtBox(passwordTxt,password);
        clickOnBtn(loginBtn);
    }
}
