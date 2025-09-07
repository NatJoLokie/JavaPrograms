package autoPrep;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxMinList {

	public static void main(String[] args) {
		List<Integer> maximum = Arrays.asList(20, 40, 50, 90);
		
		int largest = Collections.max(maximum);
		
		System.out.println("print largest number:" +largest);
		
		int smallest = Collections.min(maximum);
		
		System.out.println("print the smallest:" +smallest);
		
		
		
		

	}

}
