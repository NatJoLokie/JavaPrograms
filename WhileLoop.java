package autoPrep;

public class WhileLoop {
	
	
	public static void whileLoop() {
		
		//declare variable
		int i = 1, n = 5;
		
		//while loop from 1 to 5
		
		while(i<=n) {
			
			System.out.println(i);
			i++;
			
		}
		
	}
	
	public static void dowhileLoop() {
		
		int j = 6, n = 10;
		
		do {
			System.out.println(j);
			j++;
			
		}while (j<=n);
	}

	public static void main(String[] args) {
		
		WhileLoop obj = new WhileLoop();
		obj.whileLoop();  //Calling method.
		obj.dowhileLoop();
		
		
	

	}

}
