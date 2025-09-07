package autoPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortingCollection {

	public static void main(String[] args) {
		// Sorting ArrayList
		
		List<Integer> listVar = new ArrayList<>(Arrays.asList(10, 5, 3, 100, 100));
		
		List<Integer> collect = listVar.stream().filter(s->s>3).sorted().collect(Collectors.toList());
		
		System.out.println("Stream using collect:" +collect);
		
		//Collections.sort(listVar);
		
		System.out.println("Sort the number" +listVar);
		
		List<String> listVar1 = new ArrayList<>(Arrays.asList("One", "Two", "Three"));
		
		Collections.reverse(listVar1);
		System.out.println("print in reverse:" +listVar1);
		
		//Using Java 8
		
		
	
		

	}

}
