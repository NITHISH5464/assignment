package assignment3;

public class fibbonaciseries {
	public static void main(String[] args) {
		int first=0;
		System.out.println(first);
		int second=1;
		System.out.println(second);
	
		for(int i=4;i<=9;i++) {
			
	
		{
			int sum=first+second;
		System.out.println(sum);
		first=second;
		second=sum;
		}
	}
	
}}
