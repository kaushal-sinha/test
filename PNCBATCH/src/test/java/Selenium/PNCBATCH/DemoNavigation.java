package Selenium.PNCBATCH;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class DemoNavigation {
	WebDriver driver;
  @Test
  public void navigation() throws InterruptedException   {
	 driver.get("https://www.google.com/");
	 Thread.sleep(3000);
	Assert.assertEquals("Google",driver.getTitle());
	System.out.println("Present"+driver.getTitle());
	
	 driver.navigate().to("http://www.seleniumhq.org/");
	 Assert.assertEquals("Selenium - Web Browser Automation",driver.getTitle());
	 System.out.println("Present selenium"+driver.getTitle());
	 Thread.sleep(3000);
	 
	 driver.navigate().back();//clicks on browser back
	 System.out.println("Page title is :"+driver.getTitle());
	 Assert.assertEquals(driver.getTitle(),"Google");
	 Thread.sleep(3000);
	 
	 driver.navigate().forward();;//clicks on browser back
	 System.out.println("Page title is :"+driver.getTitle());
	 Assert.assertEquals("Selenium - Web Browser Automation",driver.getTitle());
	 System.out.println("Page title is :"+driver.getCurrentUrl());
	 Thread.sleep(3000);
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
	 
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
