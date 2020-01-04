import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment2_WebDriverWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swaran\\Selenium\\SeleniumCoding\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");

		driver.findElementByXPath("//a[text()='Click to load get data via Ajax!']").click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		 WebElement ele = driver.findElementByXPath("//div[@id='results']");
		wait.until(ExpectedConditions.visibilityOf(ele));
		System.out.println(ele.getText());
		
	}

}
