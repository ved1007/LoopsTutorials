
public class FunctionsInJava {
	
	// Main method is starting point of execution
	
	public static void main(String[] args){
		FunctionsInJava obj = new FunctionsInJava();
		//one object will be created and obj is the reference variables, referring to this object
		//after creating the objects the copy of all non static methods will be given to this object
		// non static method are when user dose not use static word after public
		// it is require to create object to call the methods
		//Main method is void because we never return a values
		
		obj.test(); // 1st method
		
		int l = obj.pqr(); // 2nd method
		System.out.println(l);
		
		String s = obj.qa(); // 3rd method
		System.out.println(s);
		
		int div = obj.division(30, 10);
		System.out.println(div);
		
		
	}
		//non static methods
		public void test(){
			System.out.println("test method");
			
		}
		
		//Void is dose not return values 
		public int pqr(){
			System.out.println("PQR method");
			int a = 10;
			int b = 20;
			int c = a+b;
			
			return c;
			
		}
		
		// added String after public because user is returning s value
		public String qa(){
			
			System.out.println("qa method");
			String s = "Selenium";
			
			return s;
		}
		
		//x and y input parameters or arguments
		
		public int division(int x, int y){
			
			System.out.println("division method");
			int d = x/y;
			return d;
			
			
		}
		
	}


