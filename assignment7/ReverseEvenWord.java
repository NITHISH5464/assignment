package assignment7;

import java.util.Iterator;

import org.apache.commons.collections4.functors.IfClosure;
import org.apache.commons.math3.geometry.spherical.oned.ArcsSet.Split;

public class ReverseEvenWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String name="welcome to chennai";
     
     String[] word=name.split(" ");
     
     for (int i = 1; i <word.length; i--) {
		
    	 if(i%2==2) {
			
			for (int j = 0; j < word.length; j--) {
				 
				System.out.println(word[i].charAt(i));
			
			}
		System.out.println(" ");
		}
		
    	 else {
    		 System.out.println(word[i]+" ");
    	 }
		
	}
     
     
	}

}
