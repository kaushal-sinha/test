package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registration {
 
	WebDriver d;
	@FindBy(id="gender-female")
	static
	WebElement Chkbox_Gender;
	
	@FindBy(id="FirstName")
	static
	WebElement Txt_FirstName;
	
	@FindBy(id="LastName")
	static
	WebElement Txt_LastName;
	
	@FindBy(id="Email")
	static
	WebElement Txt_Email;
	
	@FindBy(id="Password")
	static
	WebElement Txt_Password;
	
	@FindBy(id="ConfirmPassword")
	static
	WebElement Txt_ConfirmPassword;
	
	@FindBy(id="register-button")
	static
	WebElement btn_Register;
	
	
	public static void registration(String F, String L, String E, String P, String CP) {
		
		Chkbox_Gender.click();
		Txt_FirstName.sendKeys(F);
		Txt_LastName.sendKeys(L);
		Txt_Email.sendKeys(E);
		Txt_Password.sendKeys(P);
		Txt_ConfirmPassword.sendKeys(CP);
		btn_Register.click();
		
	}
	
	public Registration(WebDriver driver) {
		this.d=driver;
	}
}
