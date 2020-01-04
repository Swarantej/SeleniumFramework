package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePgFactoryPattern {
	
	//Page Factory Pattern
	WebDriver driver;

	public LoginPagePgFactoryPattern(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	/**
	 * The below code is page factory  pattern
	 */
	@FindBy(xpath="")
	WebElement userNamePgFact;
	
	@FindBy(xpath="")
	WebElement passwordPgFact;
	
	@FindBy(xpath="")
	WebElement buttonPgFact;
	
	
	public WebElement usernamepgFact() {
		return userNamePgFact;
	}
	
	public WebElement passwordpgFact() {
		return passwordPgFact;
	}
	
	public WebElement buttonpgFact() {
		return buttonPgFact;
	}

}
