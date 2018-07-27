package tests;

import org.testng.annotations.Test;

import listener.utilities.ExcelUtility;
import pages.HomePage;
import pages.Registration;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

public class RegistrationTest {
WebDriver d; 
HomePage h;// declaration of object
Registration r;
ExcelUtility e;
	@BeforeTest
	  public void beforeTest() {
		System.setProperty("webdriver.chrome.driver","C:\\PNCB\\WorkSpace\\test1maven\\resources\\chromedriver.exe");
		  d=new ChromeDriver();
		  d.manage().window().maximize();
		  d.get("http://demowebshop.tricentis.com/register");
		  //h=new HomePage(); initialization
		  //pagefactory
		  h = PageFactory.initElements(d, HomePage.class);
		  r= PageFactory.initElements(d, Registration.class);
		  e=new ExcelUtility();
	
	}

	@Test
  public void Testregistration() throws IOException {
		h.clickRegistration();
		//r.registration();
		e.getTestdata();
  }
  
}
