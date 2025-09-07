package autoPrep;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringSet {

	public static void main(String[] args) {
		
		//List<String> listString = Arrays.asList("Dhoni", "Gambhir", "Kohli","Sharma", "Gambhir");
		
		List<Integer> listString = Arrays.asList(10, 20, 30, 10, 10);
		//Map<String, Integer> circketplayer = new HashMap<>();
		Map<Integer, Integer> circketplayer = new HashMap<>();
		
		/*
		for(String s : listString) {
			
			circketplayer.put(s, circketplayer.getOrDefault(s, 0)+1);
			
		}
		*/
		

		
		for(int s : listString) {
			
			circketplayer.put(s, circketplayer.getOrDefault(s, 0)+1);
			
		}
		
		
		System.out.println("Print cricketer name:" +circketplayer);
		

	}

}
