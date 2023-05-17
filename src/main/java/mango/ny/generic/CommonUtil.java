package mango.ny.generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import mango.ny.basepage.ParentClass;

public class CommonUtil extends ParentClass {

	public static void actionClick(WebElement ele) {
		Actions ac = new Actions(driver);
	ac.click(ele).build().perform();
	}

	public static void jsClick() {
		//JavaScriptExecutor js = (JavaScriptExecutor) driver;
	}
	
	
}
