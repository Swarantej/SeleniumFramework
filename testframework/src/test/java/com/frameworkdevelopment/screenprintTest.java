package com.frameworkdevelopment;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenprintTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\Swaran\\Selenium\\SeleniumCoding\\drivers\\chromedriver.exe");
		 * WebDriver driver = new ChromeDriver();
		 * driver.get("http://qaclickacademy.com/"); File src =
		 * ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); File dest = new
		 * File("C:\\Users\\Swaran\\Selenium\\screens\\screenshot.png");
		 * FileUtils.copyFile(src, dest);
		 */
		String path = System.getProperty("user.dir");
		System.out.println(path);

	}

}
