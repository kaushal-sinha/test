package Selenium.PNCBATCH;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class DemocheckboxSelected  {
	WebDriver driver;

  @Test
  public void f() {
	  
	 WebElement checkbox = driver.findElement(By.xpath("html/body/div[2]/p[3]/input"));
	  boolean checkflag = checkbox.isSelected();
	  System.out.println("Not selected " +checkflag);
	  checkbox.click();
	  boolean checkflag1 = checkbox.isSelected();
	  System.out.println("selected" +checkflag1);
  }
  @BeforeTest
 
	  public void beforeTest() {
		  driver = new FirefoxDriver();
		  driver.get("http://book.theautomatedtester.co.uk/chapter1");
		  driver.manage().window().maximize();
		  
  }

  @AfterTest
  public void afterTest() {
  }

}
