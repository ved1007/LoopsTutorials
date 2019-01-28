
public class LocalVsGlobleVariables {
	
	//Thses are Global variables 
	String name = "Tom";  // If you want to user this variables you need to create a method..-----method is created in local variable 
	
	int age =25;

	public static void main(String[] args) {
		
		int i =10; // local variables
		System.out.println(i);
		
		LocalVsGlobleVariables obj = new LocalVsGlobleVariables();
		System.out.println(obj.name);
		System.out.println(obj.age);
	}
	
	public void Sum(){
		int i=15; // local variables
		int j=20;
		int age=25;
		
		System.out.println(i);
		
	}

}
