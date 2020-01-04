import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class SauceLabsTest {

	 
	public static final String USERNAME = "swarantej";
	public static final String ACCESS_KEY = "fbdd4333-2c2a-4e9e-886e-ff5b878ebc3a";
	public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
	
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		//MutableCapabilities sauceOptions = new MutableCapabilities();
		//sauceOptions.setCapability("screenResolution", "1024x768");
		//DesiredCapabilities browserOptions = DesiredCapabilities.chrome();
		ChromeOptions browserOptions = new ChromeOptions();
		//browserOptions.setExperimentalOption("w3c", true);
		browserOptions.setCapability("platformName", "Windows 10");
		browserOptions.setCapability("browserVersion", "69.0");
		//browserOptions.setCapability("sauce:options", browserOptions);
		
		WebDriver driver = new RemoteWebDriver(new URL(URL),browserOptions) ;
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		

	}

}
