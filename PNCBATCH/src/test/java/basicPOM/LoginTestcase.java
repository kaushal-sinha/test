package basicPOM;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class LoginTestcase {
	WebDriver driver;
  @Test
  public void f() {
	  
	  LoginPageObjects.username(driver).sendKeys("tomsmith");
	  LoginPageObjects.password(driver).sendKeys("SuperSecretPassword!");
	  LoginPageObjects.login(driver).click();
	  
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
