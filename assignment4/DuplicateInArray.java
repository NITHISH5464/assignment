package assignment4;

public class DuplicateInArray {
	public static void main(String[] args) {
		
		int[] a= {12,34,56,54,32,12,34,56,54,32,12,34,56,78,};
		

		for(int i=0;i <a.length;i++) {
			for(int j=i=1;j <a.length;j++) {
				
				if(a[i]==a[j])
					System.out.println(a[i]);
			}
	
}
}}
