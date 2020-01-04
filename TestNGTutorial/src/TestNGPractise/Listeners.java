package TestNGPractise;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
	
	@Override
	
	public void onTestStart(ITestResult result) {
		
	}
	
@Override
	
	public void onTestSuccess(ITestResult result) {
	
	System.out.println("Executing listeners on test pass");
		
	}

@Override

public void onTestFailure(ITestResult result) {
	
	System.out.println("Executing listeners on test Failure " +result.getName());
}
	
	
}
