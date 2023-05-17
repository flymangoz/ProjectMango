package mango.ny.myrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin = {"pretty","json:target/cucumber.json"},
		features = {".//Features/"},
		glue = {"mango.ny.Stepdefinition", "mango.ny.hooks"}
		)



public class TestRunner extends AbstractTestNGCucumberTests  {

}
