package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	WebDriver d;
	@FindBy(linkText="Register")
	WebElement LinkReg;
	
	public void clickRegistration() {
		
		LinkReg.click();
	}
	
	public HomePage(WebDriver driver) {
		this.d=driver;
	}
}
