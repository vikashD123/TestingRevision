package Selenium.TestingRevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BootstrapLogin {

	@Test(enabled=true)
	public void verifyexplicit() throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
	     WebDriver driver=new ChromeDriver();
	     
	     driver.get("https://www.goibibo.com");
	     
	     driver.findElement(By.xpath("//a[text()='Sign In']")).click();
	     
	     driver.switchTo().frame("authiframe");
	     
	     driver.findElement(By.id("authMobile")).sendKeys("vikash");
	     
	     driver.findElement(By.id("mobileSubmitBtn")).click();
	     
	}
}
