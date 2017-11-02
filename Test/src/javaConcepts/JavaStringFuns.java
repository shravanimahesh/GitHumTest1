package javaConcepts;

public class JavaStringFuns {
	
	
	
		public static void main(String args[])
		{
		
						
		String str1 = "This is Java Class";
		String str2 = "          Thanks for your transaction....your ref#677888889   ";
		String str3 = "1244556890";
		String str4 = "Welcome Daniel to Facebook";
		
		// substring 
		
		
		System.out.println(str2.trim().substring(40, 49));
		
		System.out.println((str4.replace("Facebook", "Google")));
		
		
		
		
		
		// length of string 
		
		if (str3.length()== 10) 
		{
			System.out.println("pass criteria");
		}
		
		else
		{
			System.out.println("Fail");
		}
		
		// String Concatenation
		
		System.out.println(str1.concat(str2));
		
		
		if(str4.contains("Daniel"))
		{
		  System.out.println("it is present");
		  
		}
		
		else 
		{
			System.out.println("Its not present");
		}
		
		// equals 
		
		if (str4.equals("Daniel"))
		{
			System.out.println("It does match ");
			
		}
		
		else 
		{
			System.out.println("It does not match");
		}
		
		
		if (str4.equalsIgnoreCase("DANIEL"))
		{
			System.out.println("It does match ");
			
		}
		
		else 
		{
			System.out.println("It does not match");
		}
		
		// trim remove spaces
		
		System.out.println(str2);
		System.out.println(str2.trim());
		
		
		
		
		

	
	
	}

}
