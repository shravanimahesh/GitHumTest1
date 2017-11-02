package sWDConcept;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroupOfUIObject {
//changing for practice 
	public void getPopularDeals()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh\\Desktop\\h2ksoftware\\selenium-java-3.5.3\\NewBrowserChrome\\chromedriver.exe");
		
		ChromeDriver oBrowser  = new ChromeDriver();
	
		
		oBrowser.get("https://www.redflagdeals.com/");
		List<WebElement> uAllpopulardeal= oBrowser.findElements(By.xpath("//h4[@class='block__title']/a"));
		int nTotaldeals = uAllpopulardeal.size();
		System.out.println("Total number of deals "+nTotaldeals);
		
		for (int i = 0; i<nTotaldeals; i++)
		{
			System.out.println(uAllpopulardeal.get(i).getText());
			
		}
		
		
	}
	
	
	
	@Test
	public void getpopulardealswriteNotepad() throws FileNotFoundException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh\\Desktop\\h2ksoftware\\selenium-java-3.5.3\\NewBrowserChrome\\chromedriver.exe");
		ChromeDriver oBrowser = new ChromeDriver();
		
		oBrowser.get("https://www.redflagdeals.com/");
		List<WebElement> uAllPopulardeals = oBrowser.findElements(By.xpath("//h4[@class='block__title']/a"));
		
		int uSize = uAllPopulardeals.size();
		System.out.println("Total no of all popular deals" +uSize);
		
		
		// create empty file 
		
		File oFile = new File("C:\\Users\\Mahesh\\Desktop\\h2ksoftware\\redflagdeal.txt");
		// write to file 
		
		PrintWriter oPWR = new PrintWriter(oFile);
		
		
		for(WebElement ieach: uAllPopulardeals )
		{
			oPWR.print(ieach.getText());
		}
		
		//save 
		
		oPWR.flush();
		
		//close
		oPWR.close(); 
		
	}
}
