package javaConcepts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonUsingTestNG {
	
	@BeforeMethod
	public void login()
	{
		System.out.println("SWD Logic for login");
	}
	
	@AfterMethod
	public void logout() throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println("SWD Logic for logout");
		System.out.println();
	}

	@Test(priority = 3)
	public void purchaseItem()
	{
		System.out.println("SWD Logic for purchaseItem");
	}
	
	@Test(priority = 52)

	public void updateorder()
	{
		System.out.println("SWD Logic for updateorder");
	}
	
	@Test(priority = 396)

	public void trashorder()

	{
		System.out.println("SWD Logic for trashorder");
	}


}
