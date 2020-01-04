package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	public WebDriver driver;
	

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	/**
	 * Always declare the variables as private and methods accessing it within same class as public
	 * this will enable the restriction on private variables to other public methods in diff classes
	 * This is how encapsulation is handled in Framework
	 */

	private By loginLink = By.xpath("//a[@href='http://qaclickacademy.usefedora.com/sign_in']");
	public WebElement loginLink() {
		return driver.findElement(loginLink);
	}
	
	private By titleText = By.xpath("//h2[text() ='Featured Courses']");
	public WebElement titleText() {
		return driver.findElement(titleText);
	}
	
	
	private By navBar = By.xpath("//nav[@class='navbar-collapse collapse']");
	public WebElement navBar() {
		return driver.findElement(navBar);
	}
	

	private By landingPgTextValidate = By.cssSelector("div[class*='video-banner'] h3");
	public WebElement landingPgHeaderValidate() {
		return driver.findElement(landingPgTextValidate);
	}
	
	
	
	
}
