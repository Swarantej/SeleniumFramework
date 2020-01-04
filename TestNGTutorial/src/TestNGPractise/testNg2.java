package TestNGPractise;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testNg2 {

	@BeforeMethod()
	public void beforeMethod() {
		System.out.println("I'll execute before method/test case of this particular class only");
	}
	
	@Parameters({"URL"})
	@Test
	public void demo3(String url) {
		System.out.println("TestNg2 Class Demo3");
		System.out.println(url);
	}
	
	@Test (enabled= false) //this will skip the test case
	public void demo() {
		System.out.println("TestNg2 Class Demo4");
	}
	
	@Parameters({"URL1"})
	@Test(groups= {"Smoke"}) 
	public void groupsConcept(String url1) {
		System.out.println("groups concept from  Class testNG2");
		System.out.println(url1);
	}
	@BeforeTest 
	
	public void beforeTest() {
		
		System.out.println("I'll execute first before test annotation from testNG2 files");
		
	
	}
	
	@AfterMethod()
	public void afterMethod() {
		System.out.println("I'll execute after method/test case of this particular class only");
	}
	
}
