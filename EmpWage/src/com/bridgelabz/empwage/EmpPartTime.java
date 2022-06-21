package com.bridgelabz.empwage;

public class EmpPartTime {

	public static void main(String[] args) {
		
		int isPartTime = 1;
		int isFullTime = 2;
		int wagePerHour = 20;
		int workingHrs = 0;
		int dailyWage = 0;
		
		double empCheck = Math.floor(Math.random() * 10) % 3;
		
		if(empCheck == isPartTime)
		{
			workingHrs = 4;
		System.out.println("Employee is Present for "+workingHrs+" Hrs.");
		}
		else if(empCheck == isFullTime)
		{
			workingHrs = 8;
		System.out.println("Employee is Present for "+workingHrs+" Hrs.");
		}
		else
		{	
			workingHrs = 0;
		System.out.println("Employee is Absent");
		}
		dailyWage = workingHrs * wagePerHour;
		System.out.println("Daily Wage is : " + dailyWage);

	}

}
