// Program 2_15
// Arithmetic 
// Andrew Chow
package com.mycompany.ass2.chapter2;

import java.util.Scanner;		// import class scanner
public class Program_2_15 
{
	public static void main (String[]args)
	{
		Scanner input = new Scanner(System.in);
		int number1, number2, sum, product, difference, quotient;
		
		System.out.print("Enter first integer: ");
		number1 = input.nextInt();
		
		System.out.print("Enter second integer: ");
		number2 = input.nextInt();
		
		input.close();
		
		// calculate and store
		sum = number1 + number2;
		product = number1 * number2;	
		difference = number1 - number2;	
		quotient = number1 / number2;	
		
		// display output
		System.out.printf("Sum is %d\n", sum);
		System.out.printf("Product is %d\n", product);
		System.out.printf("Difference is %d\n", difference);
		System.out.printf("Quotient is %d\n", quotient);
		
	}
	
}
// Output
/*
Enter first integer: 4
Enter second integer: 2
Sum is 6
Product is 8
Difference is 2
Quotient is 2
*/