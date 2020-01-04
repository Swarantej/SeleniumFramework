import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Add2Cart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium Material\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		//Implicit Wait
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String []vegetables = {"Brocolli", "Cauliflower", "Cucumber","Carrot"};
		//Expected Array
		addItems(driver, vegetables);
		
		
	}
	
	 public static void addItems(WebDriver driver,String []vegetables) throws InterruptedException {
		 
		 List <WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
		//Explicit waait
			WebDriverWait wait = new WebDriverWait(driver, 5);
		
			for(int i =0; i< products.size(); i++) {
				
				//Splitting the name with -
				String[] name = products.get(i).getText().split("-");
				String formattedName = name[0].trim();
				
				//Check whether the name is present in the  Veggeies Array, to do this we will
				//COnvert array into arraylist for easy search
				List vegetablesList = Arrays.asList(vegetables);
				int j =0;
				if( vegetablesList.contains(formattedName)){
					j++;
					driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
					if(j==vegetables.length) {
						break;
					}
				}
			}
			driver.findElement(By.xpath("//img[@alt='Cart']")).click();
			driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='promoCode']")));
			
			
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
			driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated((By.cssSelector("span.promoInfo"))));
			String promoMsg = driver.findElement(By.cssSelector("span.promoInfo")).getText();
			System.out.println(promoMsg);
			
	 }

}
