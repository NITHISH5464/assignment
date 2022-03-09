package assignment13;

import java.util.HashSet;
import java.util.Set;

public class OnlyUniqueCharacter {
	public static void main(String[] args) {
		String input="babub";
	 
	Set<Character> dup=new HashSet<Character>();
	for (int i = 0; i < input.length()-1; i++) {
		dup.add(input.charAt(i));
	}
	dup.remove('b');
   System.out.println(dup);
	}

}
