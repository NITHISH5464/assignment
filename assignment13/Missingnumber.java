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
		Set<Integer> miss=new LinkedHashSet<Integer>();
		miss.add(4);
		miss.add(6);
		miss.add(7);
		miss.add(6);
		miss.add(2);
		miss.add(3);
		miss.add(1);
		miss.add(9);
		miss.add(10);
		miss.add(8);
		miss.add(8);
		miss.add(6);
		//System.out.println(miss);
		List<Integer> add=new ArrayList<Integer>(miss);
		Collections.sort(add);
		System.out.println(add);
		//missing element
		for (int i = 0; i <=add.size(); i++) {
			System.out.println(i);
			
			
		}
		
		}
	}