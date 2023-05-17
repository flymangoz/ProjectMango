package mango.ny.basepage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParentClass {

	public static WebDriver driver;
	public static Properties prop;
	public Properties configProp;

	public ParentClass() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("./src/main/java/mango/ny/config/Config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void initialization() {

		String browser = prop.getProperty("browserName");

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			System.out.println(">>There is no browser for testing<<");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("QA_ENV"));
	}

//	public void initialization() {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.automationexercise.com/login");
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("tanvirpatwary16@gmail.com");
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Tester01");
//		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
//		String text = driver.findElement(By.xpath("//*[text()=' Home']")).getText();
//		System.out.println("Visibility text::" + text);
//		Assert.assertEquals("Home", text);
//
//	}

}
