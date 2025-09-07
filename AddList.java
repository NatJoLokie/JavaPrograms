package autoPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddList {

	public static void main(String[] args) {
		List<Integer> var1 = Arrays.asList(10, 5, 3);
		List<Integer> var2 = Arrays.asList(15, 4, 9);
		
		List<Integer> var3 = new ArrayList<>();
		
		for(int i = 0; i<var1.size(); i++) {
			
			var3.add(var1.get(i) + var2.get(i));
			
		}
		System.out.println("Adding the list:" +var3);

	}

}
