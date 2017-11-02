package sWDConcept;
import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.junit.Test;

public class BrowserwithIE 
{
		
	
		@Test
		public void searchItemIE()
		{
			
		// open 		IE browser
		System.setProperty("webdriver.ie.driver","C:\\Users\\Mahesh\\Desktop\\h2ksoftware\\selenium-java-3.5.3\\NewBrowserIE\\IEDriverServer.exe");
			
		DesiredCapabilities capabilies = DesiredCapabilities.internetExplorer();
		capabilies.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		InternetExplorerDriver oBrowser = new InternetExplorerDriver(capabilies);
				
		//, launch www.ebay.com ,
		
		oBrowser.navigate().to("https://www.ebay.com/");
		System.out.println(oBrowser.getTitle());
		
		
		//enter search textbox " Laptop", 
		
		oBrowser.findElement(By.id("gh-ac")).clear();
		oBrowser.findElement(By.id("gh-ac")).sendKeys("Laptop");
		
			
		//click on search button
		
		oBrowser.findElement(By.id("gh-btn")).click();
		
		
		
		}// end method 
		
	} //end class



