import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_Miscellanious {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Swaran\\\\Selenium\\\\SeleniumCoding\\\\drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Delete all the cookies
		
		driver.manage().deleteAllCookies();
		
		//Delete the specific cookie name
		driver.manage().deleteCookieNamed("CookieName");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://qaclickacademy.com/practice.php");

		//Take screenshot
		
		File src =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\Swaran\\Selenium\\Screenshots\\screen.png"));
		
	}

}
