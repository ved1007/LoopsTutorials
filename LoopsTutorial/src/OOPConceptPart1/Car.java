package OOPConceptPart1;

public class Car {
	
	//Class variables
	int mod;
	int wheel;
	

	public static void main(String[] args) {
		
		// new keyword is used to create the object
		// a,b,c Object reference variables 
		
		Car a = new Car();  // new Car(); -- this is the object of Car class
		Car b = new Car();
		Car c = new Car();
		
		a.mod=2014;
		a.wheel=4;
		
		b.mod=2015;
		b.wheel=4;
		
		c.mod=2016;
		c.wheel=4;
		System.out.println(a.mod);
		System.out.println(b.mod);
		System.out.println(c.mod);

	}

}
