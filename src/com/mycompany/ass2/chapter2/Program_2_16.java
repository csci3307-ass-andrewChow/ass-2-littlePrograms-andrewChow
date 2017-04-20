// Program 2.16
// Comparing integers
// Andrew Chow

package com.mycompany.ass2.chapter2;
import java.util.Scanner;

public class Program_2_16 
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		int number1, number2;	// variables
		
		// inputs
		System.out.print("Enter first integer: ");
		number1 = input.nextInt();
		
		System.out.print("Enter second integer: ");
		number2 = input.nextInt();
		input.close();
		// conditions and output
		if(number1>number2)	
			System.out.printf("%d is larger\n", number1);
		else if(number2>number1)
			System.out.printf("%d is larger\n", number2);
		else
			System.out.printf("These numbers are equal\n");
	}
}
// Output
/*
Enter first integer: 6
Enter second integer: 7
7 is larger

Enter first integer: 5
Enter second integer: 5
These numbers are equal 
*/