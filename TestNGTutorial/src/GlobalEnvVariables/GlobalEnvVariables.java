package GlobalEnvVariables;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class GlobalEnvVariables {
	
	
	//Declare the WebDriver driver globally so that driver object can be used across the file and inside loops
	public WebDriver driver = null;
	
	@Test
	 public void dataFromPropFile() throws IOException {
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\Swaran\\Selenium\\TestNGTutorial\\src\\GlobalEnvVariables\\envVariables.properties");
		prop.load(file);
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver.exe");
		System.out.println(prop.getProperty("username"));
		
		if(prop.getProperty("browser").equals("Chrome")) {
			driver = new ChromeDriver();
		}
		else if(prop.getProperty("browser").equals("Firefox")) {
			driver = new FirefoxDriver();
		}
		else {
			driver = new InternetExplorerDriver();
		}
		
		driver.get(prop.getProperty("url"));
		
	}

}
