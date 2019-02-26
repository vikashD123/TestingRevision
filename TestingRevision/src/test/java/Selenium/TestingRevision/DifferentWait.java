package Selenium.TestingRevision;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DifferentWait {

	@Test(enabled=false)
	public void verifyError() throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
	     WebDriver driver=new ChromeDriver();
	     
	     driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	     
	     driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
	     
	     driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
	     
	     WebElement el=driver.findElement(By.xpath("//p[text()='QTP']"));
	     
	     boolean status=el.isDisplayed();
	     
	     if(status){
	    	 
	    	 System.out.println("element is displayed");
	     }
	     else {
	    	 System.out.println("Element is not diplayed");
	     }
	     
	}
	
	@Test(enabled=true)
	public void verifyexplicit() throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
	     WebDriver driver=new ChromeDriver();
	     
	     driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
	     
	     driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
	     
	     WebDriverWait wait=new WebDriverWait(driver,3000);
	     
	     WebElement el=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='QTP']")));
	     
	     boolean status=el.isDisplayed();
	     
	     if(status) {
	    	 
	    	 System.out.println("element is displayed");
	     }
	     else {
	    	 System.out.println("element is not displayed");
	     }
	}
}
