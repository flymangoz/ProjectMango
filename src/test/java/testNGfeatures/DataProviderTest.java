package testNGfeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderTest {

	WebDriver driver;
	@DataProvider(name="Authentication")
	public static Object[][] credentials(){
		return new Object[][] {
			{ "tanvirpatwary16@gmail.com", "Tester01","Valid Credential" },
			{ "tanvirpatwary45@gmail.com", "Tester001","Invalid Credential" }, 
			{ "tanvirpatwary00@gmail.com", "Tester000", "Invalid Credential" },
			{ "test123456565656@gmail.com", "dsfsf", "Invalid Credential" } };
	
	}
	@Test (dataProvider = "Authentication")
	public void getLogin(String userName, String password, String validationCredential ) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.automationexercise.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
	     if(validationCredential.contains("Invalid Credential")) {
	    	 String validationText =driver.findElement(By.xpath("//*[text()='Your email or password is incorrect!']")).getText();
	 		
		     Assert.assertEquals(validationText, "Your email or password is incorrect!");	 
	     }
	     else {
	    	 String validationText =driver.findElement(By.xpath("//*[text()=' Logout']")).getText();
		 		
		     Assert.assertEquals(validationText.trim(), "Logout");	  
	     }
		driver.quit(); 
	}
	
}
