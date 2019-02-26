package Selenium.TestingRevision;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JAvaScriptLab {

	@Test(enabled=true)
	public void verifyexplicit() throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
	     WebDriver driver=new ChromeDriver();
	     
	     driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
	     
	     JavascriptExecutor js=(JavascriptExecutor)driver;
	     
	     //To scroll till some amount
	  //   js.executeScript("window.scrollBy(0,300)");
	     
	     //To scroll till bottom
	     
	    // Thread.sleep(3000);
	     
	  //   js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	     
	  //   To scroll till particular element
	     
	     
	 //   WebElement el=driver.findElement(By.xpath("//input[@id='toPlaceName']"));
	    
	 //   js.executeScript("arguments[0].scrollIntoView()",el);
	     
	     //to send text
	     
	//     js.executeScript("document.getElementById('fromPlaceName').value='BANG'");
	  
	     //To get text
	     
	     driver.findElement(By.id("fromPlaceName")).sendKeys("BANG");
	     
	     driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
	     
	     driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
	     
	     String text="return document.getElementById('fromPlaceName').value";
	     
	     String str=(String)js.executeScript(text);
	     
	     System.out.println(str);
	     
	     
	}
	
}
