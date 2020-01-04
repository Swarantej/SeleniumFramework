package resources;

import java.io.*;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Base {
	
	/**
	 * To execute the test cases parallely do not declare WebDriver driver as static,
	 * as it allows only instance of driver,
	 *son next testcases will be confused for the driver to execute
	 *So if your test execution is sequential basis then you can declare as STATIC as it saves heap memory
	 *Generally people do not declare variables as static until and unless required
	 */
public static WebDriver driver;
//public  WebDriver driver;
public Properties prop;

 public WebDriver invokeBrowser() throws IOException {
	 
	 prop = new Properties();
	 String path = System.getProperty("user.dir");
	 System.out.println(path);
	 FileInputStream file = new FileInputStream(path+"\\src\\main\\resources\\data.properties");
	 
	 prop.load(file);
	 //This below code takes the paramters from the Prop file and executes according
	 String browserName = prop.getProperty("browser");
	 
		/*
		 * This below code takes the parameters from Maven command and executes
		 * accoringly. Helpful to paramertise the Jenkins MAVEN COmmand: 
		 * mvn test -Dbrowser="chrome"
		 * System.getProprty- Takes the command from Maven
		 * //We can also pass the commands/Parameter through Jenkis configuration and to maven 
		 */
	 
	// String browserName = System.getProperty("browser");
	 
		/*
		 * The below method gives the directory of the project so, we can avoid the long
		 * paths and it will help to run the scripts to run directly in other machines
		 */
	 //System.getProperty("user.dir");
	 
	 System.out.println(browserName);
	 if(browserName.contains("chrome")) {
		 System.setProperty("webdriver.chrome.driver", path+"\\drivers\\chromedriver.exe");
		 ChromeOptions options = new ChromeOptions();
		 
		 if(browserName.contains("headlerss")) {
			 options.addArguments("headless");
			 driver = new ChromeDriver(options); 
		 }
				 
		 
		  driver = new ChromeDriver();
		
	 }else if(browserName.equalsIgnoreCase("Firefox")){
		 System.setProperty("webdriver.gecko.driver", path+"\\drivers\\geckodriver.exe");
		  driver = new FirefoxDriver();
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
	 }else if(browserName.equalsIgnoreCase("IE")){
		 System.setProperty("webdriver.ie.driver", path+"\\drivers\\geckodriver.exe");
		  driver = new InternetExplorerDriver();	 
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 }
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 return driver;
 }
	
 public void takeScreenshot(String result) throws IOException {
	 String path = System.getProperty("user.dir");
	System.out.println(path);
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest = new File(path+"\\screenprints\\"+result+"\\screenshot12.png");
	FileUtils.copyFile(src, dest);
	

	
 }
	

}
