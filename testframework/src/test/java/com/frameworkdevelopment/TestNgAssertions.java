package com.frameworkdevelopment;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;

import resources.Base;

public class TestNgAssertions extends Base {

	static Logger log = LogManager.getLogger(TestNgAssertions.class.getName());
	LandingPage lPage;

	@BeforeTest

	public void initializeBrowser() throws IOException {
		driver = invokeBrowser();
		driver.get(prop.getProperty("url"));
		log.info("Invoked the browser");

	}

	
	  @Test
	  
	  public void validateText() throws IOException {
	  
	  lPage = new LandingPage(driver);
	  String text = lPage.titleText().getText();
	  System.out.println(text); Assert.assertEquals(text, "FEATURED COURSES");
	  
	  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); File
	  dest = new File("C:\\Users\\Swaran\\Selenium\\screens\\screenshot1.png");
	  FileUtils.copyFile(src, dest);
	   }
	 

	@Test

	public void validateLandingPageText() throws IOException {
		LandingPage lPage = new LandingPage(driver);
		String text1 =lPage.landingPgHeaderValidate().getText();
		System.out.println(text1);
		Assert.assertEquals(text1, "AN ACADEMY TO LEARN EVERYTHING ABOUT TESTING");

		/*
		 * File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); File
		 * dest = new File("C:\\Users\\Swaran\\Selenium\\screens\\screenshot1.png");
		 * FileUtils.copyFile(src, dest);
		 */
	}

	@AfterTest

	public void tearDown() {
		driver.close();
		driver = null;
	}

}
