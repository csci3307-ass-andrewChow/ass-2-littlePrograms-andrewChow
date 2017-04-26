// Program 4.15 (Figure 4.15)
// Andrew Chow
// Prefix increment and postfix increment operators

package com.mycompany.ass2.chapter4;

public class Program_4_15 {
	public static void main(String[]args)
	{
		// demonstrate postfix increment operator
		int c = 5;
		System.out.printf("c before phost increment %d%n", c, args);	// prints 5
		System.out.printf("      phostincrementing c: %d%n", c++);	// prints 5
		System.out.printf(   "c after postincrement: %d%n", c); // prints 6
		
		System.out.println();	// skip a line
		
		// demonstrate prefix increment operator
		c = 5;
		System.out.printf(" c before preincrement %d%n", c);	// prints 5
		System.out.printf("     preincrementing c: %d%n",  ++c); // prints 6
		System.out.printf("  c after preincrement: %d%n", c);	// prints 6
	}
}	// end class
