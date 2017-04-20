// Program 5.9
// Code Fragments
// Andrew Chow

package com.mycompany.ass2.chapter5;

public class Program_5_9 {
	public static void main(String [] args)
	{
		// a
		for( int i = 100; i >= 1; i--)	// uppercase F, i was not initialized, commas replaced with semicolons
			System.out.println(i);		// i changed to decrement otherwise it would be an infinite loop
		
		// b
		int value=0;
		switch(value%2)
		{
		case 0: 
			System.out.println("Even integer");
			break;		// missing breaks
		case 1:
			System.out.println("Odd integer");
			break;
		}
		
		// c
		for (int j = 19; j>= 1; j-=2)		// changed += to -= to avoid infinite loop
			System.out.println(j);
		
		// d
		int counter =2;
		do
		{
			System.out.println(counter);
			counter +=2;
		}while (counter<100);	// upper case While changed to lower case
		
	}
}
