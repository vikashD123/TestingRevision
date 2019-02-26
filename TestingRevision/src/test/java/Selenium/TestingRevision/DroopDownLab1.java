package Selenium.TestingRevision;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DroopDownLab1 {
	
	@Test(enabled=false)
	public void verify() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement el=driver.findElement(By.id("day"));
		
		Select s=new Select(el);
		
		s.selectByIndex(8);
		
	Thread.sleep(3000);
	
	   s.selectByVisibleText("30");
	
	Thread.sleep(3000);
	
	    s.selectByValue("4");

	}

	@Test(enabled=false)
	public void verify2() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement el=driver.findElement(By.id("month"));
		
		Select s=new Select(el);
		
		WebElement el1=s.getFirstSelectedOption();
		
		System.out.println("Before selecting-----"+el1.getText());
		
		s.selectByIndex(8);
		
		WebElement el2=s.getFirstSelectedOption();
		
		System.out.println("after selecting ------"+el2.getText());
		
		Thread.sleep(3000);
		
		driver.close();
		
	}
	@Test(enabled=true)
	public void verify3() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
	
		WebElement el=driver.findElement(By.id("month"));
		
		Select s=new Select(el);
		
		List<WebElement>el2=s.getOptions();
		
		int count=el2.size();
		
		System.out.println("Totaal value-----"+count);
		
		for(int i=0;i<count;i++) {
			
			WebElement value=el2.get(i);
			
			String text=value.getText();
			
			System.out.println(text);
			
			if(text.equalsIgnoreCase("aug")) {
				
				value.click();
				
				break;
			}
		}
	Thread.sleep(2000);
	
	driver.close();
}
	
	@Test(enabled=true)
	public void bootStrap() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");

		WebDriver driver=new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		List<WebElement>el=driver.findElements(By.xpath("//ul[@role='menu']//li/a"));
		
		int count=el.size();
		
		System.out.println("total value----"+count);
		
		for(int i=0;i<count;i++) {
			
			WebElement drop_down=el.get(i);
			
			String text=drop_down.getText();
			
			System.out.println(text);
			
			if(text.equalsIgnoreCase("javasscript")) {
				
				drop_down.click();
				
				break;
			}
		}
		Thread.sleep(3000);
		
		driver.close();
	
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
}
