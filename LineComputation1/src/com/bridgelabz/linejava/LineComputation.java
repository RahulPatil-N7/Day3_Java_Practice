package com.bridgelabz.linejava;

import java.util.Scanner;

public class LineComputation {

	public static void main(String[] args) {
		
System.out.println("Welcome to line comparison computation program.");
		
		// UC-1 : Calculate length of line
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Enter co-ordinates of Line!");
		
		System.out.println("Enter x1 :");
		int x1 =scanner.nextInt();
		System.out.println("Enter y1 :");
		int y1 =scanner.nextInt();
        
		System.out.println("Enter x2 :");
		int x2 =scanner.nextInt();
		System.out.println("Enter y2 :");
		int y2 =scanner.nextInt();
		
		
		
		double line1= Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		System.out.println("Lenght of Line :"+ line1);
		
		
	}

}
