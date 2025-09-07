package autoPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListInterface {

	public static void main(String[] args) {
		
		List<String>name = new ArrayList<>();
		
		name.add("Veera");
		name.add("Arun");
		name.add("Ram");
		name.add("Ram");
		
		System.out.println("printname:" +name);
		
		System.out.println("printname:" +name.get(1));
		
		name.add(2, "Lokesh");
		
		System.out.println(name);
		
		String indexof = name.get(1);
		
		System.out.println("print last:" +indexof);
		
		name.set(4, "Harish");
		
		System.out.println("print addding name:" +name);
		
		name.remove(3);
		
		System.out.println("removing  name:" +name);
		
		name.remove("Lokesh");
		
		System.out.println("removing via string  name:" +name);
		
		int listSize=name.size();
		
		System.out.println("print the size:" +listSize);
		
		boolean contname = name.contains("Arun");
		System.out.println("Contains name or not:" +contname);
		
		int index = name.indexOf("Veera");
		
		System.out.println("Indexof List:" +index);
		
		String HeroName[] = {"Vijay", "Rajini","Surya"};
		
		//List<String>name1 = Arrays.asList(HeroName);
		
		//System.out.println(name1);
		List<String>name1 = new ArrayList(Arrays.asList(HeroName));
		
		//name1.addAll(name);
		System.out.println("print the latest name:" +name1);
		
		//Using Java 8 Concept
		
		List <String> concatList = Stream.concat(name.stream(), name1.stream()).collect(Collectors.toList());
		
		System.out.println(concatList);
		
		
		
		
		
		

	}

}
