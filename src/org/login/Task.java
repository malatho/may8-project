package org.login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\heman\\eclipse-workspace\\3PMSeleniumClass11Mar24\\library\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     
	     driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
	     Thread.sleep(10000);
	     driver.manage().window().maximize();
	     
	     WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
	     
	     List<WebElement> allRows = table.findElements(By.tagName("tr"));	     
	     for(int i=allRows.size()-1;i>=0;i--) {
	    	 WebElement individualRow = allRows.get(i);
	    	  if(i==0) {
	    	     List<WebElement> allHeading = individualRow.findElements(By.tagName("th"));
	    	       for(int j=allHeading.size()-1;j>=0;j--) {
	    	    	    String text = allHeading.get(j).getText();
	    	    	    System.out.print(text + "\t");
	    	    	   
	    	       }
	    	       System.out.println();
	     }
	    	  else {
	    		  List<WebElement> allData = individualRow.findElements(By.tagName("td"));
	    		   for(int k=allData.size()-1;k>=0;k--) {
	    	        WebElement individualData = allData.get(k);
	    	        System.out.print(individualData.getText()+"\t");
	    			  
	    		  }
	    		  System.out.println();
	    		  
	    	  }
	}

}
}