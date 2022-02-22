package assignment4;

public class FindIntersection {
	
	public static void main(String[] args) {
		int[] a1= {1,2,3,4,5,};
		int[] a2= {7,6,5,4,3,2};
		
		for(int i=0;i<a1.length;i++) {
			for(int j=0;j<a2.length;j++) {
				if(a1[i]==a2[j])
					System.out.println(a1[i]);
				
			}
		}
 
}}
