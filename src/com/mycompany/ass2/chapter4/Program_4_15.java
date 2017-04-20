// Program 4.15
// Code fragments
// Andrew Chow
package com.mycompany.ass2.chapter4;

public class Program_4_15 {
	public static void main(String[]args)
	{
		// a
		int age = 0;
		if (age >= 65)	// removed semicolon
		{
			System.out.println("Age is greater than or equal to 65");
		}
		else 
			System.out.println("Age is less than 65");	// quotes in wrong position
		
		// b
		int x = 1, total = 0; // total not initialized 
		while(x<=10)
		{
			total+=x;
			++x;
		}
		
		// c
		while (x<=100)
		{					// missing opening and closing braces;
			total +=x;
			++x;
		}	
		
		// d
		int y = 0;
		while(y>0)
		{
			System.out.println(y);
			++y;
		}	// missing closing braces
	}
}
