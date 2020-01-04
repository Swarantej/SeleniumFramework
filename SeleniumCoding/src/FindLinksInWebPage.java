import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLinksInWebPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swaran\\Selenium\\SeleniumCoding\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.qaclickacademy.com/");
		//driver.findElementsByTagName("a").size();
		
		//To print all the links in the page
		System.out.println(driver.findElementsByTagName("a").size());
		
		//To print the links in the footer section
		//for this we need to limit the scope of the driver to the footer section alone
		
		WebElement footerSection = driver.findElementByCssSelector("#prefooter");
		int linksNum = footerSection.findElements(By.tagName("a")).size();
		System.out.println(linksNum);
		
		
		WebElement subFooterSection=  driver.findElementByXPath("//div[@class='col-sm-3']/nav/ul");
		int subFooterlinksNum = subFooterSection.findElements(By.tagName("a")).size();
		System.out.println(subFooterlinksNum);
		
		//CLick on each link on seperate tab
		
		for(int i =0; i<subFooterlinksNum; i++) {
			
			String clickLinks = Keys.chord(Keys.CONTROL,Keys.ENTER);
			subFooterSection.findElements(By.tagName("a")).get(i).sendKeys(clickLinks);
			Thread.sleep(2000);
		}
		//Verify the Title seperately
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		while(it.hasNext()) {
			String window = it.next();
			 driver.switchTo().window(window).getTitle();
			 String title = driver.getTitle();
			System.out.println(title);
			Thread.sleep(2000);
			
		}
		
		}

}
