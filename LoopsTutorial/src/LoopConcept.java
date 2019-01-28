
public class LoopConcept {

	public static void main(String[] args) {


		//while loop:
		// dis advantave of while loop is it will generate infinite loop if you dont give incremental / decremental part.
		int i =1;
		while(i<=10){
			System.out.println(i);
			i=i+1;
		}

		// For loop
		for (int j=1;j<=10;j++){
			System.out.println(j);
		}
		
		for (int k=10; k>=1;k--){
			System.out.println(k);
		}
		
	}

}
