package sWDConcept;

import org.openqa.selenium.By;
//import org.junit.Test;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

	

public class Handlinglink{
	
	
	
		
		public void HLink()
		{
			
		// open chrome  browser
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh\\Desktop\\h2ksoftware\\selenium-java-3.5.3\\NewBrowserChrome\\chromedriver.exe");
			
		ChromeDriver oBrowser  = new ChromeDriver();
		
				
		//, launch www.ebay.com ,
		
		oBrowser.get("https://www.ebay.com/");
		
		//Click on "SignIn "Link
	    WebElement uSignIn =	oBrowser.findElement(By.linkText("Sign in"));
	    uSignIn.click();
	    
	    // or
		//oBrowser.findElement(By.linkText("Sign in")).click();	
	    
	    
		
		
		}// end HLink METHOD
		
       
		
		public void handleCheckbox()
        
        {
        	// open chrome  browser
        				System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh\\Desktop\\h2ksoftware\\selenium-java-3.5.3\\NewBrowserChrome\\chromedriver.exe");
        				
        			ChromeDriver oBrowser  = new ChromeDriver();
        			
        					
        			//, launch www.ebay.com ,
        			
        			oBrowser.get("https://www.ebay.com/");
        			
        			//Click on "advance  "Link
        		    WebElement uSignIn =	oBrowser.findElement(By.linkText("Advanced"));
        		    uSignIn.click();
        		    
               		    // Title and Description Checkbox
        		    
        		   /*if (oBrowser.findElement(By.id("LH_TitleDesc")).isSelected())
        		   {
        			   
        			   // dont do anything
        		   }
        		   
        		   else
        		   {
        		    oBrowser.findElement(By.id("LH_TitleDesc")).click();
        		    
        		    
        		   }*/
        		  
        		    
        		    if (!(oBrowser.findElement(By.id("LH_TitleDesc")).isSelected()))
        		    {
        		    	oBrowser.findElement(By.id("LH_TitleDesc")).click();
        		    }// end if 
        		    
        			
        			      	
        	
        }// end method handlecheckbox methd 
        
		
		public void handleRadioButton()
		{
			// open chrome  browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh\\Desktop\\h2ksoftware\\selenium-java-3.5.3\\NewBrowserChrome\\chromedriver.exe");
			
		ChromeDriver oBrowser  = new ChromeDriver();
		
				
		//, launch www.southwest.com ,
		
		oBrowser.get("https://www.southwest.com/");
		
		
	    String sOption = "Oneway";
	    		
	    		if(sOption.equals("RoundTrip"))
	    		{
	    			
	                  oBrowser.findElement(By.id("trip-type-round-trip")).click();
		
	    		}
	    		else
	    		{
	    			oBrowser.findElement(By.id("trip-type-one-way")).click();
	    		}
	    


			
			
		}// end of handlerdiobutton method
        
		
		
		@Test
		public void handleDropdown() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh\\Desktop\\h2ksoftware\\selenium-java-3.5.3\\NewBrowserChrome\\chromedriver.exe");
			
			ChromeDriver oBrowser  = new ChromeDriver();
			
					
			//, launch www.ebay.com ,
			
			oBrowser.get("https://www.ebay.com/");
			
			// Click on "    All Categories " dropdown 
			
			//Select uIcategory = new Select(oBrowser.findElement(By.id("gh-cat")));
			
			//or
			
			WebElement uicategoryObj = oBrowser.findElement(By.id("gh-cat"));
			Select uicategory = new Select(uicategoryObj );
			
				uicategory.selectByVisibleText("Books");
				
				
				Thread.sleep(3000);
				uicategory.selectByIndex(2);
		
				Thread.sleep(3000);
				uicategory.selectByValue("11232");
			System.out.println(uicategory.getOptions().size());
			
			
		}// end method 
		
		
		
}// end method 



