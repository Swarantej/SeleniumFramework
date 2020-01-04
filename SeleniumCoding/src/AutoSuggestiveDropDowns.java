import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropDowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Swaran\\\\Selenium\\\\SeleniumCoding\\\\drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://ksrtc.in/oprs-web/");
		driver.findElement(By.id("fromPlaceName")).sendKeys("BENG");
			
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String script = "return document.getElementById('fromPlaceName').value;";
		String text = (String) js.executeScript(script);
		System.out.println(text);
		int i=0;
		while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT")){
			i++;
			driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
			 text = (String) js.executeScript(script);
			System.out.println(text);
			if(i>10) {
				break;
			}
		}
		if(i>10) {
			System.out.println("element not found");
		}else {
			System.out.println("Element found");
		}
	
	}

}
