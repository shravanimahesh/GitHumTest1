package sWDConcept;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.logging.Level;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class SpecialCases {
	
	WebDriver oBrowser;
	
	public void openBrowser(String soBrowsertype , String sURL)
	{
		if(soBrowsertype.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh\\Desktop\\h2ksoftware\\selenium-java-3.5.3\\NewBrowserChrome\\chromedriver.exe");
			oBrowser = new ChromeDriver();
			
		}
		
		else if(soBrowsertype.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver","C:\\Users\\Mahesh\\Desktop\\h2ksoftware\\selenium-java-3.5.3\\NewBrowserIE\\IEDriverServer.exe");
			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true );
			oBrowser = new InternetExplorerDriver();
		}
		
		else if(soBrowsertype.equals("FireFox"))
		{
			
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Mahesh\\Desktop\\h2ksoftware\\selenium-java-3.5.3\\NewBrowserFireFox\\geckodriver.exe");
			oBrowser = new FirefoxDriver();
		}
		
		else if(soBrowsertype.equals("HTMLUnitDriver"))
		{
			java.util.logging.Logger.getLogger("com.gargoylesoftware.htmlunit").setLevel(Level.OFF);
			oBrowser = new HtmlUnitDriver();
		}
		
		
		
		oBrowser.get(sURL);
		oBrowser.manage().window().maximize();
		
	}// end method 
	
	
	public void HandlingMenus() throws InterruptedException
	{
		openBrowser("FireFox","http://www.nasdaq.com/");
	Actions oAct = new Actions(oBrowser);
	oAct.moveToElement(oBrowser.findElement(By.xpath("//span[contains(.,'Quotes')]/ancestor::a")));
	oAct.build();
	oAct.perform();
	
	Thread.sleep(2000);
	
	oBrowser.findElement(By.partialLinkText("Stock Reports")).click();
	
		
	}// end method 
	
	
	
	public void getScreenShot(String sFilePath) throws IOException
	{
		
		// takes screen shot of screen
		TakesScreenshot oScrn = (TakesScreenshot) oBrowser;
		
		// save the screen shot in file 
		
		File oSrc = oScrn.getScreenshotAs(OutputType.FILE);
		
		// create new empty file
		
		File oDst = new File(sFilePath);
		
		// copy th file
		
	   org.apache.commons.io.FileUtils.copyFile(oSrc, oDst);
		
		
	}
	

	public void getScreenShot () throws IOException
	{
		openBrowser("Chrome" , "http://www.nasdaq.com/");
	    getScreenShot("C:\\Users\\Mahesh\\Desktop\\h2ksoftware\\screen.jpeg");
	}
	
	

	public void HandlingAlert() throws InterruptedException
	{
		openBrowser("Chrome", "http://www.nasdaq.com/symbol/adp/real-time");
		
		//make sure checkbox is selected 
		
		if (! oBrowser.findElement(By.id("cookiepref")).isSelected()) 
		{
			oBrowser.findElement(By.id("cookiepref")).click();
		}
		
		// unselect checkbox
		
		oBrowser.findElement(By.id("cookiepref")).click();
		
		//switch focus to alert using Alert 
		
		Alert oAlt = oBrowser.switchTo().alert();
		Thread.sleep(2000);
		
		//accept 
		oAlt.accept();
		
		//dismiss
		
		//oAlt.dismiss();
	}
	
	
	
	public void HandlingMultipleBrowser()
	{
		openBrowser("Chrome", "https://www.cigna.com/");

		System.out.println(oBrowser.getTitle());
		// click on cign MEDICARE
		oBrowser.findElement(By.linkText("Cigna Medicare")).click();
		// GET PARENT ID 
		String ParentID = oBrowser.getWindowHandle();
		
		//All Browser Parent ID 
		
		Set<String> uAllBrowserID = oBrowser.getWindowHandles();
		
			
		//switch the focus from main window to child window by excluding parentID
		
		for(String sEachBrowserID : uAllBrowserID)
		{
			if(!(sEachBrowserID.equals(ParentID)))
			{
				// changing the focus to child browser
				
				oBrowser.switchTo().window(sEachBrowserID);
				
				break;
				
			}
		}
		
		oBrowser.findElement(By.xpath("//a[@href='/medicare/medicare-advantage/index.html']")).click();
		
 	     
	}

	@Test
	public void HandlingFrame() throws InterruptedException
	
	{
		openBrowser("Chrome","http://www.proquest.com/about/careers/current-career-opportunities.html");
		oBrowser.switchTo().frame(oBrowser.findElement(By.className("careers")));
		
		Select uICountry = new Select(oBrowser.findElement(By.id("location")));
		uICountry.deselectAll();
		Thread.sleep(2000);
		uICountry.selectByVisibleText("Dubai");
		Thread.sleep(2000);
		uICountry.selectByVisibleText("Asia");
		
	}
	
}
