package Selenium.TestingRevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HighElement {

	WebDriver driver;
	
	@Test
	public void color() {
		
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
	     WebDriver driver=new ChromeDriver();
	     
	     driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
	     
	     WebElement el=driver.findElement(By.id("fromPlaceName"));
	     
	     High.capture(driver, el);
	     
	     el.sendKeys("BANG");
	     
	     WebElement el1=driver.findElement(By.id("toPlaceName"));
	     
	     High.capture(driver, el1);
	     
	     el1.sendKeys("GOA");
	     
	   WebElement el3= driver.findElement(By.xpath("//button[@type='button']"));;
	   
	   High.capture(driver, el3);
	   
	   el3.click();
	}
}
