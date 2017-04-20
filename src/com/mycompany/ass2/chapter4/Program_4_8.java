// Program 4.8 
// Code fragments
// Andrew Chow

package com.mycompany.ass2.chapter4;

public class Program_4_8 {
	public static void main(String[]args)
	{
		int c=0, product=0, gender=1;
		// a
		while(c<=5)
		{
			product *=c;
			++c;
		} // <= error
		
		// b
		if(gender ==1)
			System.out.println("Woman");
		else	// <= removed ;
			System.out.println("Man");
	}
}
