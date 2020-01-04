package com.frameworkdevelopment;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import resources.Base;


public class Listeners implements ITestListener {
	
	Base baseClass = new Base();
	
	public void onTestFailure(ITestResult result ) {
		
		try {
			baseClass.takeScreenshot(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
 