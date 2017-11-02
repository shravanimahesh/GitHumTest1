package sWDConcept;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathHandleTable {
	
	@Test
	public void handleTableComplexXpath()
	{
		
	// open chrome  browser
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh\\Desktop\\h2ksoftware\\selenium-java-3.5.3\\NewBrowserChrome\\chromedriver.exe");
		
	ChromeDriver oBrowser  = new ChromeDriver();
	
	//launch www.ebay.com 
	
	oBrowser.get("http://www.nasdaq.com/");
	
	
	
	//System.out.println(oBrowser.findElement(By.xpath("//a[contains(.,'Spartan Motors')]/ancestor::td/following-sibling::td[3]")).getText());
	
	
	//String sZkey = "Codexis";
	//System.out.println(oBrowser.findElement(By.xpath("//a[contains(.,'"+ sZkey +"')]/ancestor::td/following-sibling::td[3]")).getText());
	
   System.out.println( oBrowser.findElement(By.xpath("//a[contains(.,'NEXA RESOURCES')]/ancestor::td/following-sibling::td")).getText());
	
	}// end method 


}
