package assignment3;

import io.cucumber.java.ca.Cal;

public class Calculator {
	public void multipleTwonumber(double a,double b) {
		System.out.println("multiple"+":"+ a*b);
	}
public void dividTwonumber(float a,float b) {
	System.out.println("divid"+":"+a/b);
	
}
public static void main(String[] args) {
	Calculator input=new Calculator();
	input.dividTwonumber(65.26f, 75.87f);
	input.multipleTwonumber(65353, 726250);
}

}
