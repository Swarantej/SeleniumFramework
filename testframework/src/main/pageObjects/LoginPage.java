package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//Here we identify objects using Page Factory method
	
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	/**
	 * Always declare the variables as private and methods accessing it within same class as public
	 * this will enable the restriction on private variables to other public methods in diff classes
	 * This is how encapsulation is handled in Framework
	 */
	
	//Page Factory 
	@FindBy(css = "input[id='user_email']")
	private WebElement email;
	public WebElement emailField() {
		return email;
	}

	@FindBy(id = "user_password")
	private WebElement password;
	public WebElement passwordField() {
		return password;
	}
	
	@FindBy(xpath = "//input[@name='commit']")
	private WebElement signInBtn;
	public WebElement signBtn() {
		return signInBtn;
}
	
	@FindBy(xpath = "//div[@class='alert alert-danger']")
	private WebElement errorMsg;
	public WebElement errorMsg() {
		return errorMsg;
}
	
	
	
}
