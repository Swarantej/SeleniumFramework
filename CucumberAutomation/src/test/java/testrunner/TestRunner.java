package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\Users\\Swaran\\Selenium\\testframework\\src\\test\\java\\features\\login.feature"},
		glue={"stepdefinitions"})

public class TestRunner {
	
}
