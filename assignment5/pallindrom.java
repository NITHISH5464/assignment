package assignment5;

import java.util.Iterator;

import org.apache.poi.hssf.record.chart.SeriesToChartGroupRecord;

public class pallindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input=new String ("malayalam");
		String rev="";
		//char[] chararray=input.toCharArray();
		
		
		 for(int i=input.length()-1; i>=0; i--) {
			
			 rev=rev+input.charAt(i); 
	
		
		 }
		 if(input.equals(rev)) {
			 System.out.println(rev+" "+"this is pallindrom" );
		 }
		 else {
			 System.err.println(rev+" "+"this is not pallindrom");
		 }
		
		//	for (int i =name.length()-1; i>=0; i--)
		
		
	

}}
