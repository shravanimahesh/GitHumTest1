package javaConcepts;

import transport.Car;
import transport.Train;


public class CalcualtorWithInputAndReturn {
	
	public CalcualtorWithInputAndReturn(){
		
	}// end constructor
	
	
	
		int c;
		
		int  addition(int a, int b){
			
			c= a+b;
			return c;
			
			}
		

		int substraction(int a, int b ){
			c = a-b;
			
			return c;
			
		}
		
		int  multiplication(int a , int b){
			
			c= a * b;
			
			return c;
			
		}
		
		int  division(int a, int b){
			
			c= a/b;
			return c;
			
			
		}
		
		String getcarmodel(String sbrand, int rating)

		{
			return "HONDA";
		}
		
		boolean isTimeup()
		{
			return true;
		}
		
		
	String  getcarinfo(Car oxyz)
		{
			oxyz.moveforward();
			return "Return Object";
			
		}
	
	Train bestTransport()
	{
		Train obullet = new Train();
		return obullet;
	}
		
		
		public static void main(String args[]) {
			
			CalcualtorWithInputAndReturn obj;
			obj = new CalcualtorWithInputAndReturn();
			int iaddition = obj.addition(10,20);
			System.out.println(iaddition);
			
			System.out.println(obj.substraction(40,50));
			System.out.println(obj.multiplication(50,60));
			System.out.println(obj.division(10,2));
			
			Car obmw = new Car();
			obj.getcarinfo(obmw);
			
		//	Train oA = obj.bestTransport();
			
		}
		
		
	}// end class calculatorwithinoutparam




