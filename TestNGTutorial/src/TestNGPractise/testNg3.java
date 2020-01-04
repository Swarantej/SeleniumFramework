package TestNGPractise;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class testNg3 {

	@Test
	public void demo5() {
		System.out.println("TestNg2 Class Demo5");
		Assert.assertTrue(false);
	}
	
	@Test (timeOut = 2000)//This will increase the wait time for particular test case only
	public void demo6() {
		System.out.println("TestNg2 Class Demo6");
	}
	
	@Test(groups= {"Smoke"}) 
	public void groupsConcept() {
		System.out.println("groups concept from  Class testNG3");
	}
	
	@BeforeSuite
	
	public void beforeSuite() {
		System.out.println("I'll execute even before(before suite) any testcase executes, to help in settong up env variables");
	}
	
	
@BeforeClass
	
	public void beforeClass() {
		System.out.println("I'll execute even before(before class) any testcase executes in that particular class");
	}
@AfterClass

public void afterClass() {
	System.out.println("I'll execute even after(after class) any testcase executes in that particular class");
}
	
	
}
