package transport;

public class Car {
	
	
	
	 public String scolor;
	int iNoDoors;
	float fLength;
	boolean bIsTransmission;
	
	public Car()
	
	{
		
	}// default constructor 
	
	public Car (String scarcolor, int idoors )
	{
		scolor = scarcolor;
		iNoDoors= idoors;
	}// Parameterized Constructor
	
	void start(){
	System.out.println("//logic related to start");
	}
	
	void stop(){
		System.out.println("//logic related to stop");
		}
	
	public void moveforward(){
		System.out.println("//logic related to moveforward");
		}
	
	void movebackward(){
		System.out.println("//logic related to movebackward");
		}



public static void main(String args[]){
	Car obmw = new Car();
	obmw.scolor = "Blue";
	obmw.start();
	obmw.movebackward(); 
	
	Car oBMW_X1= new Car("RED", 2);
	oBMW_X1.movebackward();
	
	
	Car oAccura;
	oAccura= new Car();
	oAccura.moveforward();
	
	
	
}// end main

}// end class
