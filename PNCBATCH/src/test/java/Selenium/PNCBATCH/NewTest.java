package Selenium.PNCBATCH;

import org.testng.annotations.Test;

import com.thoughtworks.selenium.webdriven.commands.GetTitle;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

 
public class NewTest {
	WebDriver driver;
  @Test
  public void linkEnable() {
	  
	 WebElement link = driver.findElement(By.linkText("Images"));
	 boolean enableflag =link.isEnabled();
	 System.out.println("enabled" +enableflag);
	 link.click();
	 System.out.println("title name" +driver.getTitle());
	  
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
	  driver.get("http://google.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
