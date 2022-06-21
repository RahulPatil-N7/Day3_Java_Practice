package com.bridgelabz.empwage;

public class EmpMonthlyWage {

	public static final int isPartTime = 1;
	public static final int isFullTime = 2;
	public static final int wagePerHour = 20;
	public static final int workingDays = 20;

	public static void main(String[] args) {
		int workingHrs = 0, dailyWage = 0, monthlyWage = 0;
		
		for(int day = 0; day < workingDays; day++)
		{
			int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
			switch (empCheck)
			{
			case isPartTime:
				workingHrs = 4;
				System.out.println("Employee is Present "+workingHrs+" Hrs Daily.");
				break;
			case isFullTime:
				workingHrs = 8;
				System.out.println("Employee is Present "+workingHrs+" Hrs Daily.");
				break;
			default:
				workingHrs = 0;
				System.out.println("Employee is Absent.");
			}
			dailyWage = workingHrs * wagePerHour;
			monthlyWage += dailyWage;
			System.out.println("Daily Wage is: " + dailyWage);
		}
		System.out.println("Monthly Wage is: " + monthlyWage);
}
}  