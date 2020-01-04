package TestNGPractise;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testNg {
	
	@Test(dependsOnMethods ="demo2")
	public void demo1() {
		System.out.println("TestNg Class Demo1");
		
	}
	
	@Parameters({"URL1"})
	@Test 
	public void demo2(String url1) {
		System.out.println("TestNg Class Demo2");
		System.out.println(url1);
	
	}
	
	@Test(groups= {"Smoke"}, dataProvider = "getData") 
	public void groupsConcept(String username, String pwd) {
		System.out.println("groups concept from  Class testNG");
		System.out.println(username);
		System.out.println(pwd);
	}
	
	
@AfterTest 
	
	public void beforeTest() {
		
		System.out.println("I'll execute last aftertest annotation from testNG1 files");
	
	}

@AfterSuite
public void afterSuite() {
	System.out.println("I'll execute last after(AFTER SUITE)  all testcase executes, to help in HTML reports");
}


//DataProvider concept in TestNg

@DataProvider

public Object[][] getData() {
	
	Object[][] data = new Object[3][2];
	data[0][0] = "first row username";
	data[0][1] = "first row pwd";

	data[1][0] = "sec row username";
	data[1][1] = "sec row pwd";
	
	data[2][0] = "third row username";
	data[2][1] = "third row pwd";

	return data;

}



}
