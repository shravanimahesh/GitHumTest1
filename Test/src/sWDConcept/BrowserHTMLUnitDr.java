package sWDConcept;

import java.util.logging.Level;

import org.junit.Test;
//import org.openqa.selenium.By;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;


public class BrowserHTMLUnitDr {
	
	@Test
	public void searchItem() throws InterruptedException
	{
		
			// open HTMLUnitDr Browser
		java.util.logging.Logger.getLogger("com.gargoylesoftware.htmlunit").setLevel(Level.OFF); 

						
			 HtmlUnitDriver oBrowser  = new  HtmlUnitDriver();	
			 
			 
					 
			
			 
			 System.out.println(oBrowser.getTitle());
			 
					
			/*//, launch www.ebay.com ,
			
			oBrowser.get("https://www.ebay.com/");
		
			
			
			//enter search textbox " Laptop", 
			
			oBrowser.findElement(By.id("gh-ac")).clear();
			oBrowser.findElement(By.id("gh-ac")).sendKeys("Laptop");
			
				
			//click on search button
			
			oBrowser.findElement(By.id("gh-btn")).click();
			
			

*/
		
		
		
	}// end method

}// end class
