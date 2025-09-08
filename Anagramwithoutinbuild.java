package autoPrep;

import java.util.HashSet;
import java.util.Set;

public class Anagramwithoutinbuild {

	public static void main(String[] args) {
		String var1 = "silent";
		String var2 = "listen";
		
		Set<Character> obj1 = new HashSet<>();
		
		Set<Character> obj2 = new HashSet<>();
		/*
		for(int i = 0; i<var1.length(); i++) {
			char ch = var1.charAt(i);
			obj1.add(ch);
		}
		
		for(int i = 0; i<var2.length(); i++) {
			char ch = var2.charAt(i);
			obj2.add(ch);
		}
		*/
		for(char i:var1.toCharArray())obj1.add(i);
		for(char i:var2.toCharArray())obj2.add(i);
		
		
		
		if(var1.length() == var2.length()) {
			
			if(obj1.equals(obj2)) {
				System.out.println("String are Anagram");
			}
			else {
				System.out.println("String are not Anagram");
			}
			
		}
		else {
			System.out.println("Length is not matching");
		}

	}

}
