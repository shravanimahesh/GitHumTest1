package sWDConcept;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstSWDWithoutRec { 
	
	@Test
	public void searchItem()
	{
		
	// open chrome  browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh\\Desktop\\h2ksoftware\\selenium-java-3.5.3\\NewBrowserChrome\\chromedriver.exe");
		
	ChromeDriver oBrowser  = new ChromeDriver();
	
	
	
	
	//, launch www.ebay.com ,
	
	oBrowser.get("https://www.ebay.com/");
	
	//enter search textbox " Laptop", 
	
	oBrowser.findElement(By.id("gh-ac")).clear();
	oBrowser.findElement(By.id("gh-ac")).sendKeys("Laptop");
	
		
	//click on search button
	
	oBrowser.findElement(By.id("gh-btn")).click();
	
	
	
	
	

	}// end method 
	
	

	

}// end class
