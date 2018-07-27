package Selenium.PNCBATCH;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class DemoEnternalExternalLink {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  driver.get("https://en.wikipedia.org/wiki/Main_page");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='searchInput']")).sendKeys("Selenium (software)");
		driver.findElement(By.xpath(".//*[@id='searchButton']")).click();
		
		//Assert.assertEquals("Create account - Wikipedia",driver.getTitle());
		 String CurrentURL = driver.getCurrentUrl();
		 if (CurrentURL.contains("\"wikipedia.org\"")) {
				 System.out.println("internal link");
		 } else {
			 System.out.println("External link");
			 }
		 driver.findElement(By.xpath(".//*[@id='pt-createaccount']/a")).click();
		 driver.navigate().back();//clicks on browser back
		 System.out.println("Page title is :"+driver.getTitle());
		 Assert.assertEquals(driver.getTitle(),"Selenium (software) - Wikipedia");
		 Thread.sleep(3000);
		
		 driver.findElement(By.linkText("www.seleniumhq.org")).click();
		// driver.findElement(By.xpath(".//*[@id='mw-content-text']/div/table[2]/tbody/tr[10]/td/span/a")).click();
		 Assert.assertEquals(driver.getTitle(),"Selenium (software) - Wikipedia");
		// System.out.println("Page title is :","Selenium (software) - Wikipedia");
		 
		 if (CurrentURL.contains("wikipedia.org")) {
			 System.out.println("internal link");
	 } else {
		 System.out.println("External link");
		 }
		 
		 
		
		
		
		
		
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
