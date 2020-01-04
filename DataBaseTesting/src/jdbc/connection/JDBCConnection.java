package jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JDBCConnection {

	public static void main(String[] args) throws SQLException, InterruptedException {
		// TODO Auto-generated method stub

		String host = "localhost";
		String port="3306";
		Connection connect = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/qadbt", "root", "Blockchain@2020");
		Statement st = (Statement) connect.createStatement();
		ResultSet result = st.executeQuery("select * from  EmployeeInfo where name='Tej';");
		//Since the result set will in Set, by default the result set will point to the base index but the result set is in 1 index
		
		while(result.next()) {
			System.out.println(result.getString("age"));
			result.getString("age");
			System.out.println(result.getString("location"));
			result.getString("location");
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swaran\\Selenium\\SeleniumCoding\\drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get("https://login.salesforce.com/?locale=in");
			Thread.sleep(4000);
			driver.findElement(By.id("username")).sendKeys(result.getString("location"));
			driver.findElement(By.id("password")).sendKeys(result.getString("age"));
			Thread.sleep(4000);
			driver.close();
			
			
			
		}
		
	}

}
