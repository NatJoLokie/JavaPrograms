package autoPrep;

public class BreakContinue {
	
	public static void Breakexample() {
		int num = 10;
		
		for(int i = 1; i<= num; i++) {
			
			if(i == 9) {
				
				break;
						
			}
		System.out.println(i);	
		}
		
		
		System.out.println("*******************");	
     for(int j = 1; j<= num; j++) {
			
			if(j == 9) {
				
				continue;
						
			}
		System.out.println(j);	
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Breakexample();
		
	}

}
