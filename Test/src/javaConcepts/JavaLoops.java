package javaConcepts;

import org.junit.Test;

public class JavaLoops 

{
	
	public void exForIfLoop()
	{
		int icustage = 75;
		
		if (icustage>=70)
		{
			System.out.println("Extra 0.5% interest rate");
			
		}
		
	}// end exForIfLoop
	
		public void exForIfElseLoop()
		{
			int  icustage = 75;
			
			if (icustage>=70)
			{
				System.out.println("Extra 0.5% interest rate");
				
			}
			
			else
			{
				System.out.println("Reduce 0.5% interest rate");
			}
		
		
	}// end exForIfElseLoop

		
		public void exForNestedIfElseLoop()
		{
			int  icustage = 75;
			
			if (icustage>=80)
			{
				System.out.println("Extra 1.5% interest rate");
				
			}
			
			else if(icustage>70)
			{
				System.out.println("Reduce 0.5% interest rate");
			}
			
			else
			{
				System.out.println("reduce 0.5 % interest rate");
			}
				
					
			
	}// end exForNestedIfElseLoop
		
		public void exForNestedIfElseLoop2()

		{
			int  icustage = 75;
			String sCustGender = "Male";
			
			if (icustage>=80)
			{
				if(sCustGender=="Female")
				{
			
				System.out.println("Extra 1.5% interest rate");
			    }
				else 
				{
					System.out.println("extra 1% only");
				}
			}
			
			else if(icustage>70)
			{
				System.out.println("Reduce 0.5% interest rate");
			}
			
			else
			{
				System.out.println("reduce 0.5 % interest rate");
			}
			

		}
		
		@Test
		public void exForSwitch()
		{
			String sss = "CarRental";
			
			
			switch ( sss){
			case "Flight" :
				System.out.println("SWD Logic to click on Flights");
				break;
				
			case "Hotels" :
				System.out.println("SWD Logic to click on Flights");
				break;
				
			case "Packages" :
				System.out.println("SWD Logic to click on Flights");
				break;
				
			case "CarRental" :
				System.out.println("SWD Logic to click on Flights");
				break;
				
				default:
					break;
				
				
			}
			
		}
		
}// end class

	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
