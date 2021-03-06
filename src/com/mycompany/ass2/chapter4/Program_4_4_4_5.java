// Program figures 4.4 & 4.5 combined
// Andrew Chow

package com.mycompany.ass2.chapter4;

public class Program_4_4_4_5 {
	
	private String name;
	private double average;
	
	// constructor initializes instance variables
	public Program_4_4_4_5(String name, double average)
	{
		this.name= name;
	
	// validate that average is > 0.0 and <=100.0; otherwise,
	// keep instance variable average's default value (0.0)
	if (average > 0.0)
		if(average<=100.0)
			this.average = average;	// assign to instance variable
	}
	// sets the Student's name
	public void setName(String name)
	{
		this.name = name;
	}
	// retrieves the Student's name
	public String getName()
	{
		return name;
	}
	// sets the Student's average
	public void setAverage(double studentAverage)
	{
		// validate that average is > 0.0 and <= 100.0; otherwise,
		// keep instance variable average's current value
		if(average>0.0)
			if (average<= 100.0)
				this.average = average; 	// assign to instance variable
	}
	
	// retrieves the Student's average
	public double getAverage()
	{
		return average;
	}
	// determines and returns the Student's letter grade
	public String getLetterGrade()
	{
		String letterGrade = "";	// initialized to empty String
		if (average>=90.0)
			letterGrade = "A";
		else if(average>=80.0)
			letterGrade = "B";
		else if(average>=70.0)
			letterGrade = "C";
		else if(average>=60.0)
			letterGrade = "D";
		else
			letterGrade = "F";
		return letterGrade;
		// end class Student
	}
	
	
	public static void main(String[]args)
	{
		Program_4_4_4_5 account1 = new Program_4_4_4_5("Jane Green", 93.5);
		Program_4_4_4_5 account2 = new Program_4_4_4_5("John Blue", 72.75);
		
		System.out.printf("%s's letter grade is %s%n", account1.getName(), account1.getLetterGrade());
		System.out.printf("%s's letter grade is %s%n", account2.getName(), account2.getLetterGrade());
		// end
	}
}
// output
/*
Jane Green's letter grade is A
John Blue's letter grade is C
*/