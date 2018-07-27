package advancedPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AdvLoginPageObject { 
	
	@FindBy(id="username")
	public static WebElement user;
	
	@FindBy(xpath=".//*[@id='password']")
	public static WebElement password;
	
	@FindBy(how=How.XPATH, using=".//*[@id='login']/button")
	public static WebElement login;
}
