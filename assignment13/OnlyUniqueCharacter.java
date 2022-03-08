package assignment13;

import java.util.HashSet;
import java.util.Set;

public class OnlyUniqueCharacter {
	public static void main(String[] args) {
		String input="babub";
	    char[] name = input.toCharArray();
	//System.out.println(name);
	Set<Character> cra=new HashSet<Character>();
	cra.add('b');
	cra.add('a');
	cra.add('b');
	cra.add('u');
	cra.add('b');
	cra.remove('b');
	System.out.println(cra);
	}

}
