package autoPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MapProgram {

	public static void main(String[] args) {
		
		String var1[] = {"India", "Pakistan", "USA", "India"};
		
		List<String> listVar = new ArrayList<>(Arrays.asList(var1));
		
		Set <String> setVar = new HashSet<>(listVar);
		
		System.out.println("print country:" +setVar);

	}

}
