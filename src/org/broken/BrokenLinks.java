package org.broken;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\heman\\eclipse-workspace\\3PMSeleniumClass11Mar24\\library\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	
	     driver.get("https://www.facebook.com/");
	
	     driver.manage().window().maximize();
	     
	     
	     
	List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	for(int i=0;i<allLinks.size();i++) {
		WebElement link = allLinks.get(i);
		String attribute = link.getAttribute("href");
		
		URL url = new URL(attribute);
		
		
		URLConnection openConnection = url.openConnection();
		
		HttpURLConnection httpConnection = (HttpURLConnection)openConnection;
		
		int responseCode = httpConnection.getResponseCode();
		 if(responseCode>=200  && responseCode<=299) {
			 System.out.println("response validate" + attribute);
		 }
		 else {
			 System.out.println("broken link"+ attribute);
		 }
			 
			 
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
