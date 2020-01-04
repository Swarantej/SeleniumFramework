package com.frameworkdevelopment;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class HomePage extends Base{
	
	
	static Logger log = LogManager.getLogger(HomePage.class.getName());
	
	@BeforeTest
	
	public void initializeBrowser() throws IOException {
		driver = invokeBrowser();
		log.info("Invoked the browser");
		
		
	}
	
	
	@Test(dataProvider="getData")
	public void basePageNavigation(String username, String password) throws IOException {
		driver.get(prop.getProperty("url"));
		log.info("Navigated to the URL");
		LandingPage lPage = new LandingPage(driver);
		lPage.loginLink().click();
		log.info("Clicked on Login Link");
		LoginPage loginPg = new LoginPage(driver);
		
		loginPg.emailField().sendKeys(username);
		log.info("Entered Username");
		loginPg.passwordField().sendKeys(password);
		log.info("Entered Password");
		//System.out.println(text);
		loginPg.signBtn().click();
		
		
		
	}
	
	//Passing dat through testNg DataProvider
	
	@DataProvider
	
	public Object[][] getData() {
		Object[][] data = new Object[2][2];
		data[0][0] = "text@gmail.com";
		data[0][1] = "123456";
		 //data[0][2] = "gmail";
		 data[1][0] = "text@Testing.com"; 
		 data[1][1] = "8968";
		 
		 //data[1][2] = "com";
		 
		
		return data;
	}
	
	@AfterTest
	
	public void tearDown() {
		driver.close();
		
	}
}
