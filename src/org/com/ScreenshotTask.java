package org.com;

import java.io.File;

import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScreenshotTask {
	public static WebDriver driver;
	
	public static void taskScreen(String name) {
		try {
			TakesScreenshot s = (TakesScreenshot)driver;
			
		File dis = s.getScreenshotAs(OutputType.FILE);
		File target = new File("C:\\Users\\heman\\OneDrive\\Pictures\\Camera Roll"+name+".jpeg"); 
		FileUtils.copyFile(dis, target); 
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void main (String[] args) {
		System.setProperty("Webdriver.chrome.driver", 
				"C:\\Users\\heman\\eclipse-workspace\\3PMSeleniumClass11Mar24\\driver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		
		WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
		text.sendKeys("vivo T2 Pro 5G",Keys.ENTER);
		
		WebElement phoneDetails = driver.findElement(By.xpath("//div[text()='vivo T2 Pro 5G (Dune Gold, 128 GB)']"));
		phoneDetails.click();
		
		String parenWindow = driver.getWindowHandle();
		System.out.println("parenwindow id is ;"+parenWindow);
		Set<String> allwindowsid = driver.getWindowHandles();
		System.out.println("allwindowsid is "+allwindowsid);
		for(String x:allwindowsid) {
			if(!parenWindow.equals(x));
			    driver.switchTo().window(x);
			    
				System.out.println("child window is "+x);
		}
		
		
		WebElement addToCart = driver.findElement(By.xpath("//button[text()='Add to cart']"));
		addToCart.click();
	}
	
	
	
	
	

}
