package sWDConcept;

import org.openqa.selenium.By;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Test;


public class BrowserFireFox {
	//changing for git example
	@Test
	public void searchItem()
	{
		// open FireFox Browser
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Mahesh\\Desktop\\h2ksoftware\\selenium-java-3.5.3\\NewBrowserFireFox\\geckodriver.exe");
		
		FirefoxDriver oBrowser  = new FirefoxDriver();
		
				
		//, launch www.ebay.com ,
		
		oBrowser.navigate().to("https://www.ebay.com/");
		System.out.println(oBrowser.getTitle());
		
		
		//enter search textbox " Laptop", 
		
		oBrowser.findElement(By.id("gh-ac")).clear();
		oBrowser.findElement(By.id("gh-ac")).sendKeys("Laptop");
		
			
		//click on search button
		
		oBrowser.findElement(By.id("gh-btn")).click();
		
		

		
	}// end method
	
}// end class
