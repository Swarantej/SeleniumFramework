package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPagePgObjPattern {
	
	
	//Page Object Pattern
	
	WebDriver driver;

	public LoginPagePgObjPattern(WebDriver driver) {
		this.driver = driver;
		
	}
	/**
	 * The below code is page object pattern
	 */
	By username = By.xpath("");
	By password = By.xpath("");
	By button = By.xpath("");
	
	public WebElement username() {
		return driver.findElement(username);
	}
	
	public WebElement password() {
		return driver.findElement(password);
	}
	
	public WebElement button() {
		return driver.findElement(button);
	}
	
	
	

	
	
}
