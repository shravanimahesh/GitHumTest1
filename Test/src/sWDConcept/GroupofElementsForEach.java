package sWDConcept;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GroupofElementsForEach {
	
			public void getPopularDealsForEach()
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh\\Desktop\\h2ksoftware\\selenium-java-3.5.3\\NewBrowserChrome\\chromedriver.exe");
			
			ChromeDriver oBrowser  = new ChromeDriver();
		
			
			oBrowser.get("https://www.redflagdeals.com/");
			List<WebElement> uAllpopulardeal= oBrowser.findElements(By.xpath("//h4[@class='block__title']/a"));
			int nTotaldeals = uAllpopulardeal.size();
			System.out.println("Total number of deals "+nTotaldeals);
			
			for(WebElement uieachpopular : uAllpopulardeal)
			{
				System.out.println(uieachpopular.getText());
			}
			
			
		}
		
	
 public void getPopularDealswritenotepad() throws FileNotFoundException
 {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh\\Desktop\\h2ksoftware\\selenium-java-3.5.3\\NewBrowserChrome\\chromedriver.exe");
	
	ChromeDriver oBrowser  = new ChromeDriver();

	
	oBrowser.get("https://www.redflagdeals.com/");
	List<WebElement> uAllpopulardeal= oBrowser.findElements(By.xpath("//h4[@class='block__title']/a"));
	int nTotaldeals = uAllpopulardeal.size();
	System.out.println("Total number of deals "+nTotaldeals);
	
	// create empty file 
	
	File oFile = new File("C:\\Users\\Mahesh\\Desktop\\h2ksoftware\\redflagdeal.txt");
	
	//write to file 
	
	PrintWriter oPWR = new PrintWriter(oFile); 
	
	for(WebElement uieachpopular : uAllpopulardeal)
	{
		oPWR.println(uieachpopular.getText());
	}
	
	 // save file 
	
	oPWR.flush();
	
	// close file 
	
	oPWR.close();
 }

 @Test
 public void AllCheckboxes() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh\\Desktop\\h2ksoftware\\selenium-java-3.5.3\\NewBrowserChrome\\chromedriver.exe");
		
		ChromeDriver oBrowser  = new ChromeDriver();
	
		
		oBrowser.get("https://www.ebay.com/sch/ebayadvsearch");
		List<WebElement> uAllcheckboxes = oBrowser.findElements(By.xpath("//input[@type='checkbox']"));

		Thread.sleep(1000);
		
		//List<WebElement> uAlltextboxes = oBrowser.findElements(By.xpath("//input[@type='textbox']"));
		
		//List<WebElement> uAlllistbox = oBrowser.findElements(By.tagname("select"));
		
		int neachcheckbox = uAllcheckboxes.size();
				
		/*for (int i = 0; i<= neachcheckbox; i++)
		{
			
			if (!(uAllcheckboxes.get(i).isSelected()))
			{
				uAllcheckboxes.get(i).click();
			}
		}*/
		
		for (WebElement ieachcheckbox:uAllcheckboxes)
		{
			if(!(ieachcheckbox.isSelected()))
			{
				ieachcheckbox.click();
			}
		
		}
		
	}

}
