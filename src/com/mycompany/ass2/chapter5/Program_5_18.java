// Program 5.18
// Modified Compound Interest program
// Andrew Chow
package com.mycompany.ass2.chapter5;

public class Program_5_18 {
	public static void main (String[]args)
	{
		int amount;			// variable changed to int from double
		int principal = 1000;
		double rate = 0.05;
		
		System.out.print("Year       Amount on deposit\n");
		
		for (int year = 1; year <=10; year++)
		{
			amount = (int)(principal * 100 * Math.pow(1 + rate, year));	// modified calculations
			
			// output formated to 2 decimal places
			System.out.printf("%4d%,20.2f%n", year, (amount + Math.pow(1.0+rate, year))/100);
		}
	}
}
// Output
/*
Year       Amount on deposit
1            1,050.01
2            1,102.51
3            1,157.63
4            1,215.51
5            1,276.29
6            1,340.10
7            1,407.11
8            1,477.46
9            1,551.34
10            1,628.91
*/