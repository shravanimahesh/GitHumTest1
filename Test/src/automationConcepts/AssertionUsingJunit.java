package automationConcepts;

import java.util.logging.Level;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AssertionUsingJunit {
	
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
	
	
	@Test
	public void Everification()
	{
		
		
		try
		{
			openBrowser("Chrome","http://www.deal4loans.com/Contents_Calculators.php");
			Assert.assertTrue("Fail,EMI calculator page is not displayed",oBrowser.findElement(By.xpath("//h1[contains(.,'EMI Calculator')")).isDisplayed());
			System.out.println("Pass, EMI Calculator page is displayed");
		
		}catch(Exception e)
		{
			System.out.println("Fail,EMI calculator page is not displayed");
		}
		
		//Assert.assertTrue("Fail,EMI calculator page is not displayed",oBrowser.findElement(By.xpath("//h1[contains(.,'EMI Calculator')")).isDisplayed());
		//System.out.println("Pass, EMI Calculator page is displayed");
		
		
		oBrowser.findElement(By.id("Loan_Amount")).clear();
		oBrowser.findElement(By.id("Loan_Amount")).sendKeys("5000");
		
		oBrowser.findElement(By.name("rate")).clear();
		
		String sExpectedLAtext = "Rs. Five Thousand .";
		String sActualLAtext =oBrowser.findElement(By.id("wordloanAmount")).getText();
		
		sExpectedLAtext = sExpectedLAtext.toLowerCase();
		sActualLAtext = sActualLAtext.toLowerCase();
		
		Assert.assertTrue("In Words Loan Amount displayed is not correct", sExpectedLAtext.contains(sActualLAtext));
		System.out.println(" In Words Loan Amount displayed is correct");
		
		oBrowser.findElement(By.name("rate")).clear();
		oBrowser.findElement(By.name("rate")).sendKeys("5");
		
		oBrowser.findElement(By.name("months")).clear();
		oBrowser.findElement(By.name("months")).sendKeys("20");
		
		oBrowser.findElement(By.xpath("//input[@value='Calculate']")).click();
		
		String sExpectedCalEMI = "261.08";
		String sActualCalEMI = oBrowser.findElement(By.name("pay")).getAttribute("value");
		
		
		Assert.assertTrue("Calculated EMI is not correct", sExpectedCalEMI.equals(sActualCalEMI));
		System.out.println("Calcualted EMI is correct");
		
		
		
	}
	


}
