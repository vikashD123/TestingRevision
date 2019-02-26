package Selenium.TestingRevision;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Check {

	@Test
	public void verifyFace() throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
	    WebDriver driver=new ChromeDriver();
	    
	    driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
	   
	    List<WebElement>el=driver.findElements(By.xpath("//input[@name='lang' and @type='checkbox']"));
	    
	    int count=el.size();
	    
	    System.out.println(count);
	    
	    for(int i=0;i<count;i++) {
	    	
	    	WebElement checkbox=el.get(i);
	    	
	    	String text=checkbox.getAttribute("id");
	    	
	    	if(text.equalsIgnoreCase("code")) {
	    		
	    		checkbox.click();
	    		
	    		break;
	    	}
	    }
	    Thread.sleep(3000);
	    
	    driver.close();
	}
}
