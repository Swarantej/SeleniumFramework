import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {
	;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Swaran\\\\Selenium\\\\SeleniumCoding\\\\drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://qaclickacademy.com/practice.php");
		
		driver.findElement(By.id("checkBoxOption2")).click();
		String selectedOption = driver.findElement(By.xpath("//label[@for='benz']")).getText();
		System.out.println(selectedOption);
		WebElement ele = driver.findElement(By.id("dropdown-class-example"));
		Select dropdown = new Select(ele);
		dropdown.selectByVisibleText(selectedOption);
		driver.findElement(By.cssSelector("input[id='name']")).sendKeys(selectedOption);
		driver.findElement(By.cssSelector("#alertbtn")).click();
		String alertText = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		if(alertText.contains(selectedOption)) {
			System.out.println(selectedOption+ " is displayed in the alert");
		}else {
			System.out.println(selectedOption+ " is displayed not in the alert");
		}
	}

}
