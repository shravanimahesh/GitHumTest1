package javaConcepts;

import transport.Car;

public class Calculatorwithinputparam {
	int c;
	
	int addition(int a, int b){
		
		c= a+b;
		
		return c;
		
	}
	

	void substraction(int a, int b ){
		c= a-b;
		
		System.out.println("substraction  of a & b is  " +c);
		
	}
	
	void multiplication(int a , int b){
		
		c= a * b;
		
		System.out.println("multiplication  of a & b is  " +c);
		
	}
	
	void division(int a, int b){
		
		c= a/b;
		System.out.println("Division  of a & b is  " +c);
		
	}
	
	void getcarmodel(String sbrand, int rating)

	{
		
	}
	
	
	void getcarinfo(Car oxyz)
	{
		oxyz.moveforward();
		
	}
	
	
	public static void main(String args[]) {
		
		Calculatorwithinputparam obj;
		obj = new Calculatorwithinputparam();
		obj.addition(10,20);
		obj.substraction(40,50);
		obj.multiplication(50,60);
		obj.division(10,2);
		
		Car obmw = new Car();
		obj.getcarinfo(obmw);
		
	}
	
	
}// end class calculatorwithinoutparam


