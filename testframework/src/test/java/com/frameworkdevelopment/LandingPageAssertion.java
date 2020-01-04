package com.frameworkdevelopment;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.Properties;

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

public class LandingPageAssertion extends Base{
	
	static Logger log = LogManager.getLogger(LandingPageAssertion.class.getName());
@BeforeTest
	
	public void initializeBrowser() throws IOException {
		driver = invokeBrowser();
		driver.get(prop.getProperty("url"));
		log.info("Invoked the browser");
		
	}

	@Test
	public void landingPageValidattion() throws IOException {
	
		LandingPage lPage = new LandingPage(driver);
		Assert.assertTrue(lPage.navBar().isDisplayed());
		log.info("Validated Navigation bar");
		
		
	}
	
	
@AfterTest
	
	public void tearDown() {
		driver.close();
		driver=null;
	}
}
