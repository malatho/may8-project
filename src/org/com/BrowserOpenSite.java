package org.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
;

public class BrowserOpenSite {
	public static void main(String[] args) throws AWTException  {
		
		System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\heman\\eclipse-workspace\\3PMSeleniumClass11Mar24\\driver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://adactinhotelapp.com/");
		
		WebElement newuserregister = driver.findElement(By.xpath("//a[text()='New User Register Here']"));
	    newuserregister.click();
	    
	    WebElement username = driver.findElement(By.id("username"));
	    username.sendKeys("malathi123abcd");
	    
	    
	    
	     
	    Robot r = new Robot();
	    
	    r.keyPress(KeyEvent.VK_TAB);
	    r.keyRelease(KeyEvent.VK_TAB);
	    
	    
	    WebElement password = driver.findElement(By.id("password"));
	    password.sendKeys("12345@abc");
	    
	    
	    
	    r.keyPress(KeyEvent.VK_TAB);
	    r.keyRelease(KeyEvent.VK_TAB);
	    
	    WebElement repassword = driver.findElement(By.id("re_password"));
	    repassword.sendKeys("12345@abc");
	    
		WebElement fullname = driver.findElement(By.id("full_name"));
		fullname.sendKeys("malathi123abcd");
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		WebElement email = driver.findElement(By.id("email_add"));
	    email.sendKeys("malathii29@gmail.com");
	    
	    r.keyPress(KeyEvent.VK_TAB);
	    r.keyRelease(KeyEvent.VK_TAB);
	    
	    r.keyPress(KeyEvent.VK_TAB);
	    r.keyRelease(KeyEvent.VK_TAB);
	    
	  
WebElement checkbox = driver.findElement(By.id("tnc_box"));
	    checkbox.click();
	    
	    WebElement register = driver.findElement(By.id("submit"));
	    
	    register.click();
	    
	    
	    
	    
	    
	}

}
