package com.bridgelabz.empwage;

public class EmpWageSwitch {

	public static final int isPartTime = 1;
	public static final int isFullTime = 2;
	public static final int wagePerHour = 20;

	public static void main(String[] args) {
		int workingHrs = 0;
		int dailyWage = 0;
		
		int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
		switch (empCheck)
		{
		case isPartTime:
			workingHrs = 4;
			System.out.println("Employee is Present for "+workingHrs+" Hrs.");
			break;
		case isFullTime:
			workingHrs = 8;
			System.out.println("Employee is Present for "+workingHrs+" Hrs.");
			break;
		default:
			workingHrs = 0;
			System.out.println("Employee is Absent");
		}
		dailyWage = workingHrs * wagePerHour;
		System.out.println("Daily Wage is: " + dailyWage);
}
}