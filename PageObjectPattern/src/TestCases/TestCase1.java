package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.LoginPagePgFactoryPattern;
import ObjectRepository.LoginPagePgObjPattern;

public class TestCase1 {

	@Test
	
	public void login() {
		System.setProperty("webdriver.chrome.driver", "Path of Driver");
		WebDriver driver = new ChromeDriver();
		//Creating an Object for Object Repository - Factory Pattern Classes
		
		LoginPagePgFactoryPattern factPattern = new LoginPagePgFactoryPattern(driver);
		factPattern.usernamepgFact();
		factPattern.passwordpgFact();
		factPattern.buttonpgFact();

		//Creating an Object for Object Repository - Object Pattern Classes
		
		LoginPagePgObjPattern ObjPattern = new LoginPagePgObjPattern(driver);
		ObjPattern.username();
		ObjPattern.password();
		ObjPattern.button();
		
		
	}
	
}
