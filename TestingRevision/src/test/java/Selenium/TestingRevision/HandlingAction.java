package Selenium.TestingRevision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingAction {

	@Test
	public void handling() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
	     WebDriver driver=new ChromeDriver();
	     
	     driver.get("https://www.facebook.com");
	     
	}
}
