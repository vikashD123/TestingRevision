package Selenium.TestingRevision;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingWindow {
	
	@Test
	public void test() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		
		driver.findElement(By.xpath("//a[@href='http://www.google.com']")).click();
		
		String window=driver.getWindowHandle();
		
		Set<String>handle=driver.getWindowHandles();
		
		Iterator<String>it=handle.iterator();
		
		String parentId=it.next();
		
		System.out.println("parent id----"+parentId);
		
		String childId=it.next();
		
		System.out.println("child id--------"+childId);
		
		driver.switchTo().window(childId);
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		
		driver.close();
		
		driver.switchTo().window(parentId);
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
