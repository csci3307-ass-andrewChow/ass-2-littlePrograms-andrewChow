// Program 4.24
// Validating User Input
// Andrew Chow
package com.mycompany.ass2.chapter4;
import java.util.Scanner;

public class Program_4_24 
{
	public static void main (String[]args)
	{
		Scanner input = new Scanner(System.in);
		int passes = 0, failures = 0, studentCounter = 1, result;
//		String input, output;

		
		while(studentCounter<=10)
		{
			System.out.println("Enter result, 1 = pass, 2 = fail : ");
			result = input.nextInt();
			if(result == 1)
			{	
				passes = passes +1;
				studentCounter = studentCounter + 1;
			}
			else if(result ==2)
			{
				failures = failures + 1;
				studentCounter = studentCounter + 1;
			}
			else 	// validation implementation
				System.out.println("Invalid entry! Try again");
		}
		input.close();
		System.out.printf("Passed: %d%nFailed:%d%n",  passes, failures);
		if (passes>8)
			System.out.println("Bonus to instructor!");
	}
}
