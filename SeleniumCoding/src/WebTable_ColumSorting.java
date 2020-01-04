import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTable_ColumSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swaran\\Selenium\\SeleniumCoding\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		List<WebElement> list = driver.findElements(By.cssSelector("tr td:nth-child(2)"));
		ArrayList<String> originalList = new ArrayList<String>();
		for(int i =0; i<list.size();i++) {
			String values = list.get(i).getText();
			System.out.println(values);
			originalList.add(values);
		}
		
		ArrayList<String> copiedList = new ArrayList<String>();
		for(int i =0; i<originalList.size(); i++) {
			copiedList.add(originalList.get(i));
		}
		
		//Sort the copied list , by default it will sort with ascending order 
		
		Collections.sort(copiedList);
		
		//To validate the Reverse order(descending order)
		
		Collections.reverse(copiedList);
		
		for(String s: copiedList) {
			System.out.println("In String format " +s);
		}
		
		//Print the sorted copied list
		
		System.out.println("Sorted Copied List " +copiedList);
		//Now compare the original list with copied list
		
		Assert.assertTrue(originalList.equals(copiedList), "Both matches");
		
		
		
	}

}
