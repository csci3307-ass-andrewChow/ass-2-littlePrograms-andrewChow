// Program 2_6
// Calculate the product of three integers
// Andrew Chow

package com.mycompany.ass2.chapter2;

import java.util.Scanner;	// import scanner jar

public class Program_2_6 
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		int x, y, z, result;	// input numbers and result
		System.out.print("Enter first integer: ");
		x = input.nextInt();	// read first integer
		
		System.out.print("Enter second integer: ");
		y = input.nextInt();	// read second integer
		
		System.out.print("Enter third integer: ");
		z = input.nextInt();
		input.close();
		result = x * y * z;		// calculate result
		
		// output result
		System.out.printf("Product is %d%n", result);
			
	}
}
/* Output
 Enter first integer: 1
Enter second integer: 2
Enter third integer: 3
Product is 6
*/
