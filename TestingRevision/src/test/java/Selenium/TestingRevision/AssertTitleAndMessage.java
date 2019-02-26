package Selenium.TestingRevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertTitleAndMessage {

	@Test(enabled=false)
	public void verifyFace() throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
	     WebDriver driver=new ChromeDriver();
	     
	     driver.get("https://www.facebook.com/");
	     
	     String actual=driver.getTitle();
	     
	     String expected="Facebook – log or sign up";
	     
	     Assert.assertEquals(actual, expected,"Value didn't matched");
	     
	     System.out.println("test completed");
	      
	}

	@Test
	public void verifyError() throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
	     WebDriver driver=new ChromeDriver();
	     
	     driver.get("https://login.yahoo.com");
	     
	     driver.findElement(By.id("login-signin")).click();
	     
	  String actual=driver.findElement(By.xpath("//p[@role='alert' and @id='username-error']")).getText();
	  
	  String expected="Sorry, we don't recognise this email address.";
	   
	   
	   SoftAssert as=new SoftAssert();
	   
	   as.assertEquals(actual, expected);
	   
	   System.out.println("test completed");
	   
	   as.assertAll();
	   
	}
	
}
