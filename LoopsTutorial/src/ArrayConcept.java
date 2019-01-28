
public class ArrayConcept {

	public static void main(String[] args) {

		// array: to store similar data type values in a array variable
		//1. int array
		//lowest bound / index = 0
		// dis advantages of array:
		// 1. size is fixed --- static array --- to over this problem we use collections-- ArrayList, HashTable
		//2. stores only similar data types --- to overcome of this problem we use Object array
		
		int i [] = new int [4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		System.out.println(i[0]);
		
		System.out.println(i.length);
		
		
	// How to create Object array.. 
	// Object is Class
	
	
	Object ob[] = new Object[6];
	ob[0] ="Tom"; //String
	ob[1] = 25; //int
	ob[2] = 12.33;
	ob[3] = "1/1/1990";
	ob[4] = "M"; //Char
	ob[5]= "London"; //String
	
	System.out.println(ob[5]);
	System.out.println(ob.length);
	
}

}
