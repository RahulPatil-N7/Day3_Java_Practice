package com.bridgelabz.linefunctions;

import java.lang.Math;

public class LineCompare {
	
	//UC-3 : Compare lines using compareTo method
	
	public void distance(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4)
	{
		double l1,l2;
        l1 = (double) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) * 1.0);
        l2 = (double) Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2) * 1.0);
        
        if (Double.compare(l1, l2) == 0)
        {
            System.out.println(("Two lines are equal."));
        }
        else if (Double.compare(l1, l2) < 0) {
            System.out.println(("Line 1 is smaller than Line 2."));
        }
        else if (Double.compare(l1, l2) > 0) {
            System.out.println(("Line 1 is greater than Line 2."));
        }
        else {
            System.out.println("Both are not equal");
        }
	}

	public static void main(String[] args) {
		
		LineCompare l1 =new LineCompare();
		l1.distance(4, 6, 5, 7, 4, 6, 5, 7);


	}
}