package GlobalEnvVariables;

import java.io.IOException;

import org.testng.annotations.Test;

public class InheritenceCallLoginMethod extends GlobalEnvVariables {
	@Test 
	
	public void testReusableCom() throws IOException {
		dataFromPropFile();
		System.out.println("We are using the inheritence cocnept to reusable LOgin COmponents");
		
	}

}
