package com.bridgelabz.linefunctions;

public class LineComparison {
	
	//UC-2 : Check equality of lines using equals method

	 double line;
     
	 public LineComparison(double x1,double y1,double x2,double y2) 
	 {
		line=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)); 
		
	 }
	 
	 public static void main(String[] args)
	 {
		 LineComparison l1=new LineComparison(3,4,5,6);
		 LineComparison l2=new LineComparison(5,3,2,9);
		 
		 if(l1.equals(l2)==true)
		 {
			 System.out.println("Two lines are equal.");
		 }
		 else
		 {
			 System.out.println("Two lines are not equal.");
		 }
	 }
}
