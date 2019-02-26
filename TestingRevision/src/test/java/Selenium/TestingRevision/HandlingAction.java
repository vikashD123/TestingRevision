package Selenium.TestingRevision;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandlingAction {

	@Test
	public void handling() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
	     WebDriver driver=new ChromeDriver();
	     
	     driver.get("https://www.facebook.com");
	     
	     Actions act=new Actions(driver);
	     
	     //To perform double click
	     
	  //   act.moveToElement(driver.findElement(By.id("email"))).click().keyDown(Keys.SHIFT).sendKeys("Vikash").doubleClick().build().perform();
	     
	     //To perform right click
	     
	     act.moveToElement(driver.findElement(By.id("email"))).click().keyDown(Keys.SHIFT).sendKeys("Vikash").contextClick().build().perform();
	     
	     Thread.sleep(3000);
	     
	     driver.close();
	     
	}
}
