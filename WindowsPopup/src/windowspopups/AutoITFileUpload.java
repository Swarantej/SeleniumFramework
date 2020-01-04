package windowspopups;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoITFileUpload {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swaran\\Selenium\\WindowsPopup\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://smallpdf.com/word-to-pdf");
		driver.findElement(By.xpath("//div[text()='Choose file']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\Swaran\\Selenium\\autoItFileUpload.exe");
		Thread.sleep(35000);
		
		/*
		 * String fileName =
		 * driver.findElement(By.xpath("//div[@class='sc-1srdl64-3 dbkVAa']")).
		 * getAttribute("value"); System.out.println(fileName);
		 */
		  
		  driver.findElement(By.xpath("//span[text()='Download']")).click();
		  Thread.sleep(35000); 
		  File f = new File("C:\\Users\\Swaran\\Downloads\\autoittest-converted.pdf"); 
		  if(f.exists()) {
		  System.out.println("File found"); 
		  }
		 
		

	}

}
