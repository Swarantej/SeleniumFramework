import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5_Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swaran\\Selenium\\SeleniumCoding\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		System.out.println(driver.findElementsByTagName("frame").size());
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		System.out.println(driver.findElementByXPath("//div[@id='content']").getText());
		
		
	}

}
