package Selenium.TestingRevision;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class High {

	public static void capture(WebDriver driver,WebElement el) {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].setAttribute('Style','background:yellow;border:2px solid red');",el);
		
		try {
			Thread.sleep(3000);
		}
		catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
		js.executeScript("arguments[0].setAttribute('Style','border:2px solid green')",el);
	}
	     
}
