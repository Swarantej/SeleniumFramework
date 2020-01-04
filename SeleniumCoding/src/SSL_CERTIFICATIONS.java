import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSL_CERTIFICATIONS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		//Directly accepts the insecured certification
		dc.acceptInsecureCerts();
		//Accpeting SSL certificates
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		//Accpeting Insecure certificates
		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		ChromeOptions c = new ChromeOptions();
		c.merge(dc);
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\Swaran\\\\\\\\Selenium\\\\\\\\SeleniumCoding\\\\\\\\drivers\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(c);
	}

}
