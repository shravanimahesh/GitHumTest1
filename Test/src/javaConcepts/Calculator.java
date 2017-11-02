package javaConcepts;

public class Calculator {
	
	int a = 20 ; int b = 10;
	
	void addition(){
		
		System.out.println("Addition of a & b is  " +(a+b));
		
	}
	

	void substraction(){
		
		System.out.println("substraction  of a & b is  " +(a-b));
		
	}
	
	void multiplication(){
		
		System.out.println("multiplication  of a & b is  " +(a*b));
		
	}
	
	void division(){
		
		System.out.println("Division  of a & b is  " +(a/b));
		
	}
	
	public static void main(String args[]) {
		
		Calculator obj;
		obj = new Calculator();
		obj.addition();
		obj.substraction();
		obj.multiplication();
		obj.division();
		
	}
	
	
}// end class calculator 
