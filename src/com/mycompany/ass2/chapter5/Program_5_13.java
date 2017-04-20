// Program 5.13
// Factorials
// Andrew Chow

package com.mycompany.ass2.chapter5;

public class Program_5_13 {
	public static void main(String[]args)
	{
		long factorial;		// integer declaration did not carry enough digits
		System.out.println("Number                   Factorial");
		for(int i = 1; i<=20;i++)		// 1 to 20
		{
			factorial = 1;
			for(int j = 1; j<=i; j++)		
			{
				factorial = factorial * j;		// multiply by j
			}
			System.out.println(i +"                         "+factorial);	// output
		}
	}
}

// output
/*
 * Number                   Factorial
1                         1
2                         2
3                         6
4                         24
5                         120
6                         720
7                         5040
8                         40320
9                         362880
10                         3628800
11                         39916800
12                         479001600
13                         6227020800
14                         87178291200
15                         1307674368000
16                         20922789888000
17                         355687428096000
18                         6402373705728000
19                         121645100408832000
20                         2432902008176640000
*/
