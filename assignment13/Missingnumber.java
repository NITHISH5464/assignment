package assignment13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Missingnumber {
	public static void main(String[] args) {
		int[] input= {4,6,7,6,2,3,1,9,10,8,8,6};
		Set<Integer> a=new TreeSet<Integer>();
		for (int i = 0; i < input.length-1; i++) {
			a.add(input[i]);			
		}
		
	List<Integer> b=new ArrayList<Integer>();
		b.addAll(a);
    System.out.println(b);		
    for (int i = 0; i <b.size()-1; i++) {
		int missing=b.get(i+1)-b.get(i);
       if(missing!=1) {
    	   System.out.println("MIISING"+" "+(b.get(i+1)-1));
       }
	}
	
}	
}		
	