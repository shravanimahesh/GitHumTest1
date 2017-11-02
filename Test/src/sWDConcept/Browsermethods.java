package sWDConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;

public class Browsermethods 
{
	
	@Test
	public void searchItem()
	{
		
	// open chrome  browser
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh\\Desktop\\h2ksoftware\\selenium-java-3.5.3\\NewBrowserChrome\\chromedriver.exe");
		
	ChromeDriver oBrowser  = new ChromeDriver();
	oBrowser.manage().window().maximize();
			
	//, launch www.ebay.com ,
	
	oBrowser.navigate().to("https://www.ebay.com/");
	System.out.println(oBrowser.getTitle());
	
	
	//enter search textbox " Laptop", 
	
	oBrowser.findElement(By.id("gh-ac")).clear();
	oBrowser.findElement(By.id("gh-ac")).sendKeys("Laptop");
	
		
	//click on search button
	
	oBrowser.findElement(By.id("gh-btn")).click();
	
	oBrowser.navigate().back();
	oBrowser.navigate().forward();
	
	System.out.println(oBrowser.getCurrentUrl());
	
	//oBrowser.close(); // close browser not using much
	
	oBrowser.quit(); //kills browser
	
	
	
	}// end method 
	


}// end class
