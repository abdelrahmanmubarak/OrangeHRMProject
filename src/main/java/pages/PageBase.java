package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
  public WebDriver driver;

    public PageBase(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    protected static void setTextInTxtBox(WebElement txtBox,String value){
        txtBox.sendKeys(value);
    }
    protected static void clickOnBtn(WebElement btn){
        btn.click();

    }
}
