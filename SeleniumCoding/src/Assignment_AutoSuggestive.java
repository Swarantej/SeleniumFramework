import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Swaran\\\\Selenium\\\\SeleniumCoding\\\\drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://qaclickacademy.com/practice.php");
		driver.findElement(By.id("autocomplete")).sendKeys("uni");
		Thread.sleep(6000);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		
		/*
		 * JavascriptExecutor js = (JavascriptExecutor) driver; String script =
		 * "return document.getElementById('autocomplete').value;"; String text =
		 * (String) js.executeScript(script);
		 */
		
		String text = driver.findElement(By.id("autocomplete")).getAttribute("value");
		int i =0;
		while(!text.equalsIgnoreCase("United States")) {
			i++;
			driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
			//text = (String) js.executeScript(script);
			text = driver.findElement(By.id("autocomplete")).getAttribute("value");
			Thread.sleep(6000);
			System.out.println(text);
			if(i>10) {
				break;
			}
			
		}
		if(i>10) {
			System.out.println("Element not found");
		}else {
			System.out.println("Element found");
		}
		
		
		
		

	}

}
