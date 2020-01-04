import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		
		int sum =0;
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Swaran\\\\Selenium\\\\SeleniumCoding\\\\drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/23347/can-vs-wel-3rd-match-super-smash-2019-20");
		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int rowCount = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		int score = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		for(int i=0;i<score-2;i++) {
			String score1 = driver.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			int scr = Integer.parseInt(score1);
			sum=sum+scr;
		}
		
		System.out.println("Score withour total " +sum);
		String extras = table.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		int extra = Integer.parseInt(extras);
		int expectedScr = sum+extra;
		System.out.println("expected Score " +expectedScr);
		
		String totalScr = table.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int actualScore = Integer.parseInt(totalScr);
		System.out.println("Actual Score " +actualScore);
		if(expectedScr==actualScore) {
			System.out.println("Scores matches");
		}else {
			System.out.println("Scores doesnot match");
		}
	}
}
