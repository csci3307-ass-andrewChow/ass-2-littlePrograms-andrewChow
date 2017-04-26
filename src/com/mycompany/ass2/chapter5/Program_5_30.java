// Program 5.30
// Modified Auto Policy Class
package com.mycompany.ass2.chapter5;

public class Program_5_30 {
	private int accountNumber;	// policy account number
	private String makeAndModel;	// car that the policy applies to
	private String state;	// two-letter state abbreviation
	
	// constructor
	public Program_5_30 (int accountNumber, String makeAndModel, String state)
	{
		this.accountNumber = accountNumber;
		this.makeAndModel = makeAndModel;
		this.state = state;
	}
	
	// sets the accountNumber
	public void setAccountNumber(int accountNumber)
	{
		this.accountNumber = accountNumber;
	}
	
	// returns the accountNumber
	public int getAccountNumber()
	{
		return accountNumber;
	}
	// sets the makeAndModel
	public void setMakeAndModel(String makeAndModel)
	{
		this.makeAndModel = makeAndModel;
	}
	// returns the makeAndModel
	public String getMakeAndModel()
	{
		return makeAndModel;
	}
	// set the state
	public void setState(String state)
	{
		this.state = state;
		if (state.equals("CT") || state.equals("MA") || state.equals("ME")||
				state.equals("NH") || state.equals("NJ")|| state.equals("NY")
				|| state.equals("PA") || state.equals("VT"))
		{
			System.out.println("You are in a no fault state");
		}
		else
		{
			System.out.println("Error, you are not in a no fault state.");
		}
	}
	public String getState()
	{
		return state;
	}
//	public boolean isNoFaultState()
//	{
//		boolean noFaultState;
//		
//		// determine whether state has no-fault auto insurance
//		switch(getState())
///		{
//		case "MA": case"NJ": case"NY": case"PA":
//			noFaultState = false;
//			break;
//		}
//		return noFaultState;
//	}
	public static void main(String[]args)
	{
		// output goes here
	}
}	// end
