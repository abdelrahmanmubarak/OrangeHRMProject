package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class TestBase {
   public static WebDriver driver;

   @BeforeSuite
    public void setUp(){
       driver = new ChromeDriver();
       driver.manage().window().maximize();
      driver.get("https://abdelrahman-trials713.orangehrmlive.com/auth/login");

   }
}
