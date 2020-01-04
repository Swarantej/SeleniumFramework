import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Swaran\\\\Selenium\\\\SeleniumCoding\\\\drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://qaclickacademy.com/practice.php");
		
		WebElement table = driver.findElement(By.id("product"));
		int row = table.findElements(By.tagName("tr")).size();
		System.out.println("Num of rows in grid is " +row);
		int column = table.findElements(By.tagName("th")).size();
		System.out.println("Num of columns in grid is " +column);
		
		List<WebElement> secondRow = table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		String secRowFrstCol = secondRow.get(0).getText();
		System.out.println(secRowFrstCol);
		String secRowSecCol = secondRow.get(1).getText();
		System.out.println(secRowSecCol);
		String secRowThirdCol = secondRow.get(2).getText();
		System.out.println(secRowThirdCol);
		
		
	}
	

}
