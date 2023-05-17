package testNGfeatures;

import org.testng.annotations.Test;

public class SameTCRunMultipleTimes {

	@Test (invocationCount=5)
	public void getMethod1() {
		System.out.println("getMethod1");
	}
	
	
}
