package automationConcepts;


import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Synchronisation
{
	
	WebDriver oBrowser;
	
	
	public void ExforImplicitWait()
	{
		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh\\Desktop\\h2ksoftware\\selenium-java-3.5.3\\NewBrowserChrome\\chromedriver.exe");
			WebDriver oBrowser = new ChromeDriver();
			
			
		oBrowser.get("http://www.deal4loans.com/Contents_Calculators.php");
		oBrowser.manage().window().maximize();
		oBrowser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		oBrowser.findElement(By.id("Loan_Amount")).clear();
		oBrowser.findElement(By.id("Loan_Amount")).sendKeys("5000");
		
		
	}
	
	public void ExforExplicitWait() throws InterruptedException
	{
		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh\\Desktop\\h2ksoftware\\selenium-java-3.5.3\\NewBrowserChrome\\chromedriver.exe");
			WebDriver oBrowser = new ChromeDriver();
			
			
		oBrowser.get("http://www.deal4loans.com/Contents_Calculators.php");
		oBrowser.manage().window().maximize();
		oBrowser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		oBrowser.findElement(By.id("Loan_Amount")).clear();
		oBrowser.findElement(By.id("Loan_Amount")).sendKeys("5000");
		Thread.sleep(6000);
			
		
	}
	
	
	public void ExforWebDriverWait() 
	
	{
		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh\\Desktop\\h2ksoftware\\selenium-java-3.5.3\\NewBrowserChrome\\chromedriver.exe");
			WebDriver oBrowser = new ChromeDriver();
			
			
		oBrowser.get("http://www.deal4loans.com/Contents_Calculators.php");
		oBrowser.manage().window().maximize();
		oBrowser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		oBrowser.findElement(By.id("Loan_Amount")).clear();
		oBrowser.findElement(By.id("Loan_Amount")).sendKeys("5000");
		
		WebDriverWait oWDW = new WebDriverWait(oBrowser, 60);
		oWDW.until(ExpectedConditions.elementToBeClickable(oBrowser.findElement(By.id("Loan_Amount"))));
		
		
	
	}

}// end method
