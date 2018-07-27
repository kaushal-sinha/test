package advancedPOM;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

public class AdvLoginTest {
	WebDriver driver;
  @Test
  public void f() {
	  
	  PageFactory.initElements(driver, AdvLoginPageObject.class);
	  AdvLoginPageObject.user.sendKeys("tomsmith");
	  AdvLoginPageObject.password.sendKeys("SuperSecretPassword!");
	  AdvLoginPageObject.login.click();
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("http://the-internet.herokuapp.com/login");
  }

  @AfterTest
  public void afterTest() {
  }

}
