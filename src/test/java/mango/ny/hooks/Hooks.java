package mango.ny.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import mango.ny.basepage.ParentClass;

public class Hooks extends ParentClass {

	@Before
	public void setUp() {
		initialization();
	}
	@After
	public void tearDown() {
		driver.quit();
	}
	
		
}
