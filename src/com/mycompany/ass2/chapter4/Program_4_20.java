// Program 4.20
// Salary Calculator
// Andrew Chow

package com.mycompany.ass2.chapter4;
import java.util.Scanner;

public class Program_4_20 
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		// variables
		double hours = 0, rate, salary;
		
		// user input
		System.out.print("Enter hours worked: ");
		hours = input.nextDouble();
		System.out.print("Enter hourly rate: ");
		rate = input.nextDouble();
		input.close();
		// algorithm
		salary = hours * rate;
		if(hours > 40)
		{
			salary = (hours - 40) *rate *.5 + salary;
		}
		// display output
		System.out.println("Salary is $" + salary);
		
	}
// output
/*
 Enter hours worked: 41
Enter hourly rate: 10
Salary is $415.0
*/
}
