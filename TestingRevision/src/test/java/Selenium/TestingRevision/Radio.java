package Selenium.TestingRevision;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Utility.Screen;

public class Radio {
	
	WebDriver driver;
	
	@Test
	public void verifyFace() throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
	   driver=new ChromeDriver();
	   
	   driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
	   
	   List<WebElement>el=driver.findElements(By.xpath("//input[@type='radio' and @name='lang']"));
	   
	   int count =el.size();
	   
	   System.out.println(count);
	   
	   for(int i=0;i<count;i++) {
		   
		   WebElement radio=el.get(i);
		   
		   String text=radio.getAttribute("id");
		   
		   if(text.equalsIgnoreCase("python")) {
			   
			   radio.click();
			   
			   Screen.capture(driver,"radioButton");
			   break;
			   
			 
			   
			  
		   }
	   }
	  
	}
	
	//It will only excute if there is any failure occur
	/*
	@AfterMethod
	public void screenshort(ITestResult result) throws IOException {
		
		if(result.FAILURE==result.getStatus()) {
			
			Screen.capture(driver,result.getName());
			
			
		}
		
	}
	*/

}
