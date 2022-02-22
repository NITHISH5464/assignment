package assignment4;

import java.util.Arrays;
import java.util.Iterator;

public class MissingElament {
	//ARRAY
	public static void main(String[] args) {
		int[] a= {1,2,3,4,6,7}; 
		Arrays.sort(a);
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			if(i+1!=a[i]) {
				System.out.println(i=1);
				break;
			}
		}
	}

}
