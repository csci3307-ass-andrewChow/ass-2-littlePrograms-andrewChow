// Program 3.11
// ModifiedAccount Class
// Andrew Chow
package com.mycompany.ass2.chapter3;
import java.util.Scanner;

public class Program_3_11 
{
	public static void main(String[]args)
	{
		double withdrawal;	// variable
		Account account1 = new Account("Jane Green", 5000.00);
		System.out.printf("%s balance: %.2f%n",account1.getName(), account1.getBalance());
		Scanner input = new Scanner(System.in);
		// withdraw
		System.out.print("Enter withdrawal amount from account: ");;
		withdrawal = input.nextDouble();
		account1.withdraw(withdrawal);
		input.close();
		// output new balance
		System.out.printf("%s balance: $%.2f%n",account1.getName(), account1.getBalance());
		
	}
}
// output
/*
Jane Green balance: 5000.00
Enter withdrawal amount from account: 50
Jane Green balance: $4950.00
*/