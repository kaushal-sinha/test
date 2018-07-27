package Selenium.PNCBATCH;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Assisment1 {
	WebDriver driver;
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() {
	  
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com/");
	  List <WebElement> allLinkElements = driver.findElements(By.xpath("//a"));
	  int linkCount= allLinkElements .size();
	  System.out.println("linkCount "+linkCount);
	  
	  
	  
	}

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
