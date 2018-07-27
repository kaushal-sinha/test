package basicPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	public static WebElement element;

	public static WebElement username(WebDriver driver) {

		element = driver.findElement(By.xpath(".//*[@id='username']"));
		return element;
	}
	public static WebElement password(WebDriver driver) {

		element = driver.findElement(By.xpath(".//*[@id='password']"));
		return element;

	}
	public static WebElement login(WebDriver driver) {

		element = driver.findElement(By.xpath(".//*[@id='login']/button"));
		return element;

	}
}

