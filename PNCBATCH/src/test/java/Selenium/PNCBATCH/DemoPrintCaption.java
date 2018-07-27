package Selenium.PNCBATCH;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class DemoPrintCaption {
	WebDriver driver;
  @Test
  public void f(){
	WebElement button= driver.findElement(By.id("secondajaxbutton"));
	String BTNCaption =button.getAttribute("value");
	System.out.println("Button caption is: "+BTNCaption);
	button.click();
	Assert.assertEquals(BTNCaption, "Load text to the page");
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
	  driver.get("http://book.theautomatedtester.co.uk/chapter1");
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
