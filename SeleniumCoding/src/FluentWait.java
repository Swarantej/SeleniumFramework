import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swaran\\Selenium\\SeleniumCoding\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.xpath("//div[@id='start']"));
		org.openqa.selenium.support.ui.FluentWait<WebDriver> wait = new org.openqa.selenium.support.ui.FluentWait<WebDriver>(driver).withTimeout(10, TimeUnit.SECONDS).pollingEvery(4, TimeUnit.SECONDS)
		.ignoring(NoSuchElementException.class);
		/*
		 * WebElement wb = wait.until(new Function<WebDriver, WebElement>() { });
		 */
	}

}
