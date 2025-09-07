package autoPrep;

public class LoopingStatement {
	
	public static void forLoop() {
		int num = 10;
		for(int i = 1; i<=num; i++) {
			System.out.print(i);
		}
		
		//System.out.println("Print out of the loop");
		
		System.out.println("");
	}
	
	public static void NestedforLoop() {
		int weeks = 3;
		int days  = 7;
		//outer for loop
		for(int i = 1; i<=weeks; i++) {
			System.out.println("Week:" +i);
			
			for(int j =1; j<=days; j++) { // inner for loop
				System.out.println("Days" +j);
			}
			
		}
		
	 }
	public static void EnchancedForLoop() {
		
		int marks[] = {30, 50, 90, 70};
		
		for(int i : marks) {
			
			System.out.println(i);
		}
		
		String name = "harish Baskar";
		
		char arr[] = name.toCharArray();
		
		for(char j : arr) {
			
			System.out.println(j);
		}
		 
	 }
	

	public static void main(String[] args) {
		//
        forLoop();
		
        NestedforLoop();
        
        //EnchancedForLoop();
		
		
	}

}
