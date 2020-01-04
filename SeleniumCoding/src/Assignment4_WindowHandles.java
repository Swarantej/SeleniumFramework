import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4_WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swaran\\Selenium\\SeleniumCoding\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElementByCssSelector("a[href='/windows/new']").click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String>it = windows.iterator();
		String parentWindow = it.next();
		String childWindow = it.next();
		driver.switchTo().window(childWindow);
		System.out.println(driver.findElementByXPath("//div[@class='example']/h3").getText());
		driver.switchTo().window(parentWindow);
		System.out.println(driver.findElementByXPath("//div[@class='example']/h3").getText());

	}

}
