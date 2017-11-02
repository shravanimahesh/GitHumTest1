package javaConcepts;

public class AmazonUsingMain {
	
	public void login()
	{
		System.out.println("SWD Logic for login");
	}
	
	public void logout()
	{
		System.out.println("SWD Logic for logout");
		System.out.println();
	}

	public void purchaseItem()
	{
		System.out.println("SWD Logic for purchaseItem");
	}

	public void updateorder()
	{
		System.out.println("SWD Logic for updateorder");
	}

	public void trashorder()

	{
		System.out.println("SWD Logic for trashorder");
	}
	
	public static void main(String args[])
	{
		AmazonUsingMain oAmazon = new AmazonUsingMain();
		// create order
		oAmazon.login();
		oAmazon.purchaseItem();
		oAmazon.logout();
		
		// Modify Order
		oAmazon.login();
		oAmazon.updateorder();
		oAmazon.logout();
		
				
		//Delete Order
		
		oAmazon.login();
		oAmazon.trashorder();
		oAmazon.logout();
		
		
	}


}
