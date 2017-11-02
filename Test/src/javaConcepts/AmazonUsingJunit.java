package javaConcepts;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AmazonUsingJunit {
	
	@Before
	
	public void login()
	{
		System.out.println("SWD Logic for login");
	}
	
	@After
	
	public void logout()
	{
		System.out.println("SWD Logic for logout");
		System.out.println();
	}

	@Test
	public void purchaseItem()
	{
		System.out.println("SWD Logic for purchaseItem");
	}
	
	@Test
	public void updateorder()
	{
		System.out.println("SWD Logic for updateorder");
	}

	@Test
	public void trashorder()

	{
		System.out.println("SWD Logic for trashorder");
	}
	
		
				
		



}
