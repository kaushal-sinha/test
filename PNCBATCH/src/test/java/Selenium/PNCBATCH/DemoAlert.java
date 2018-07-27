package Selenium.PNCBATCH;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class DemoAlert {
	WebDriver driver;
  @Test
  public void f() {
	  
	//driver.findElement(By.xpath(".//*[@id='OKTab']/button")).click();
	//Alert alertbox = driver.switchTo().alert();
	//String alertMSG = alertbox.getText();
	//System.out.println("Alert message is :"+alertMSG);
	//alertbox.accept();//click on Ok button
	//alertbox.dismiss();//click on cancel
	//driver.findElement(By.xpath(".//*[@id='OKTab']/button")).click();
	/*driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
	driver.findElement(By.xpath(".//*[@id='CancelTab']/button")).click();
	Alert alertbox1 = driver.switchTo().alert();
	String alertMSG1 = alertbox1.getText();
	System.out.println("Alert message is :"+alertMSG1);
	alertbox1.dismiss();*/
	driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
	driver.findElement(By.xpath(".//*[@id='Textbox']/button")).click();
	Alert alertbox1 = driver.switchTo().alert();
	alertbox1.sendKeys("Pooja m");
	alertbox1.accept();
  }
  
  
  
  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("http://demo.automationtesting.in/Alerts.html");
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
