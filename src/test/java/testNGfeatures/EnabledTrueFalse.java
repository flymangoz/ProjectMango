package testNGfeatures;

import org.testng.annotations.Test;

public class EnabledTrueFalse {

	@Test (enabled=true)
	public void getMethod1() {
		System.out.println("getMethod1");
	}
	@Test(enabled=false)
	public void getMethod2() {
		System.out.println("getMethod2");
	}
	@Test(enabled=false)
	public void getMethod3() {
		System.out.println("getMethod3");
	}
	@Test(enabled=true)
	public void getMethod4() {
		System.out.println("getMethod4");
	}
}
	
	

