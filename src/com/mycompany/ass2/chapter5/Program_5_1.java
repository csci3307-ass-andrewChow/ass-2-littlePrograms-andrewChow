// Program 5.1 (Figure 5.1)
// Andrew Chow
// Counter-controlled repetition with the while repetition statement

package com.mycompany.ass2.chapter5;

public class Program_5_1 {

		public static void main(String[]args)
		{
			int counter =1;		// declare and initialize control variable
			
			while (counter <= 10) // loop continuation condition
			{
				System.out.printf("%d  ", counter);
				++counter;		// increment control variable
			}
			System.out.println();
		}
}	// end class
