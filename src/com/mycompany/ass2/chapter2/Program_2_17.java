// Program 2.17
// Arithmetic, Smallest and Largest
// Andrew Chow

package com.mycompany.ass2.chapter2;

import java.util.Scanner;

public class Program_2_17 
{
	public static void main(String[] args)
	{
		// variables
		int number1, number2, number3;
		int sum, average, product, smallest, largest; 
		
		Scanner input = new Scanner(System.in);
		
		// input
		System.out.print("Enter first integer: ");
		number1=input.nextInt();
		
		System.out.print("Enter second integer: ");
		number2=input.nextInt();
		
		System.out.print("Enter second integer: ");
		number3=input.nextInt();
		
		input.close();
		
		// calculations
		sum = number1 + number2 + number3;
		average = sum/3;
		product = number1 * number2 * number3;
		
		// smallest
		if(number1<number2)
		{
			if(number1<number3)
				smallest = number1;
			else
				smallest = number3;
		}
		else 
		{
			if(number2<number3)
				smallest = number2;
			else 
				smallest = number3;
		}
		// largest
		if(number1>number2)
		{
			if(number1>number3)
				largest = number1;
			else
				largest = number3;
		}
		else 
		{
			if(number2>number3)
				largest = number2;
			else 
				largest = number3;
		}
		
		// display output
		System.out.printf("Sum is = %d\n", sum);
		System.out.printf("Average is = %d\n", average);
		System.out.printf("Product is = %d\n", product);
		System.out.printf("Smallest is = %d\n", smallest);
		System.out.printf("Largest number is = %d\n", largest);
		
	}
}
// output
/*
Sum is = 6
Average is = 2
Product is = 6
Smallest is = 1
Largest number is = 3
*/