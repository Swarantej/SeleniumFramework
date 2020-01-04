import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swaran\\Selenium\\SeleniumCoding\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.cssSelector("#travel_date")).click();
		String month = driver.findElement(By.cssSelector("[class = 'datepicker-days'] [class = 'datepicker-switch']")).getText();
		if(!month.contains("January")) {
			driver.findElement(By.cssSelector("[class = 'datepicker-days'] [class = 'next']")).click();
		}
		
		String date = "26";
		int count = driver.findElements(By.className("day")).size();
		
		for(int i = 0; i<= count; i++) {
			String expDate = driver.findElements(By.className("day")).get(i).getText();
			if( expDate.equalsIgnoreCase(date)) {
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}
		
		
	
		

	}

}
