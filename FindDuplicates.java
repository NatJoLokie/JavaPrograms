package autoPrep;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {

	public static void main(String[] args) {
		
		int arr1[] = {20, 40, 80, 20, 70};
		
		Set<Integer> unique = new HashSet<>();
		
		Set<Integer> duplicate = new HashSet<>();
		
		for(int i : arr1) {
			
			if(!unique.add(i)){
				
				duplicate.add(i);
				
			
			}
			
		}
		System.out.println("print unique:" +unique);
		System.out.println("print duplicate:" +duplicate);
		
		
		
		
		
		

	}

}
