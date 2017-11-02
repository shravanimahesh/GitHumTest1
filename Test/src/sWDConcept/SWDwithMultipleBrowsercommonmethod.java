package sWDConcept;

import java.util.logging.Level;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SWDwithMultipleBrowsercommonmethod {
	
	WebDriver oBrowser ;
	
	public void openBrowser (String sBrowsertype , String sURL )
	{
			
		if(sBrowsertype.equals("Chrome")) 
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh\\Desktop\\h2ksoftware\\selenium-java-3.5.3\\NewBrowserChrome\\chromedriver.exe");
			
			oBrowser  = new ChromeDriver();
			
		}
		
		else if (sBrowsertype.equals("IE"))
		{
			
			System.setProperty("webdriver.ie.driver","C:\\Users\\Mahesh\\Desktop\\h2ksoftware\\selenium-java-3.5.3\\NewBrowserIE\\IEDriverServer.exe");
			
			DesiredCapabilities capabilies = DesiredCapabilities.internetExplorer();
			capabilies.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			
			 oBrowser = new InternetExplorerDriver(capabilies);

			
		}
		
		else if (sBrowsertype.equals("FireFox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Mahesh\\Desktop\\h2ksoftware\\selenium-java-3.5.3\\NewBrowserFireFox\\geckodriver.exe");
			oBrowser  = new FirefoxDriver();
			
			
		}
		
		else if(sBrowsertype.equals("HTMLUnitDriver"))
		{
			java.util.logging.Logger.getLogger("com.gargoylesoftware.htmlunit").setLevel(Level.OFF); 
	
			 oBrowser  = new  HtmlUnitDriver();	
			
		}
		
		oBrowser.get(sURL);
		oBrowser.manage().window().maximize();
		
	}// end method openbrowser
	

	public void searchItemChrome()
	{
	
		openBrowser ("Chrome" , "https://www.ebay.com/" );
		
		oBrowser.findElement(By.id("gh-ac")).clear();
		oBrowser.findElement(By.id("gh-ac")).sendKeys("Laptop");
	
		oBrowser.findElement(By.id("gh-btn")).click();
	
	}// end method 
	
	public void searchItemIE()
	{
		
	openBrowser ("IE" , "https://www.ebay.com/" );
	oBrowser.navigate().to("https://www.ebay.com/");
	System.out.println(oBrowser.getTitle());
	
	oBrowser.findElement(By.id("gh-ac")).clear();
	oBrowser.findElement(By.id("gh-ac")).sendKeys("Laptop");
	
	oBrowser.findElement(By.id("gh-btn")).click();
	
	
	}// end method 
	
	public void searchItemHTMLUnit() 
	{
		
			
		openBrowser ("HTMLUnitDriver" , "https://www.ebay.com/" ); 
			 System.out.println(oBrowser.getTitle());
			 
			oBrowser.findElement(By.id("gh-ac")).clear();
			oBrowser.findElement(By.id("gh-ac")).sendKeys("Laptop");
			
			oBrowser.findElement(By.id("gh-btn")).click();
			

	}// end method

	@Test
	public void searchItemFireFox()
	{
		
		openBrowser ("FireFox","https://www.ebay.com/" );
		System.out.println(oBrowser.getTitle());
		
		
		oBrowser.findElement(By.id("gh-ac")).clear();
		oBrowser.findElement(By.id("gh-ac")).sendKeys("Laptop");
				
				
		oBrowser.findElement(By.id("gh-btn")).click();
	}// end method


}
