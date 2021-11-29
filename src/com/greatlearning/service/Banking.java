package com.greatlearning.service;

import java.util.Scanner;

public class Banking { 
	
	Scanner scan1=new Scanner(System.in); 
	int balance=3000;
	
	public void deposit()
	{
		System.out.println("Depositing");
		int amount;
		System.out.println("Enter a Amount to Deposit");
		amount=scan1.nextInt();
		if(amount>0)
		{
			balance=balance + amount;
			System.out.println("The Amount :"+amount+ " Deposited Successfully");
			System.out.println("Current Balance after Deposit is"+balance);
		}
		else
		{
			System.out.println("Sorry Invalid Deposit Amount");
		}
	}
	
	public void withdraw()
	{
		System.out.println("Withdrawing");
		int amount;
		System.out.println("Enter a Amount to Withdraw");
		amount=scan1.nextInt();
		if(balance-amount>=0)
		{
			System.out.println("Amount "+amount+" Withdrawn Successfully");
			balance=balance-amount;
			System.out.println("The Balance After Withdrawal is "+balance); 
		}
		else
		{
			System.out.println("Sorry Insuffecient Balance");
		}
	}
	
	public void transferFund()
	{
		System.out.println("Transfering Funds");
		int amount;
		String bankAccountNoTo;
		int otpGenerated;
		int otp;
		OTPGenerator otpGen = new OTPGenerator();
		otpGenerated = otpGen.genrateOTP();
		System.out.println("The OTP Generated is "+otpGenerated);
		System.out.println("Enter the OTP :");
		otp = scan1.nextInt();
		if(otp == otpGenerated)
		{
			System.out.println("Enter the Account NO. to which you want to transfer the Amount");
			bankAccountNoTo=scan1.next();
			System.out.println("Enter the Amount You Wish to Transfer...");
			amount = scan1.nextInt();
			if(balance - amount >=0)
			{
				System.out.println("Amount "+amount+"Transferred to Account "+bankAccountNoTo+" Successfully");
				balance = balance - amount;
				System.out.println("The Balance Remaining after Fund Transfer is "+balance);
			}
			else
			{
				System.out.println("Sorry!!! Insufficient Balance...");
			}
			}
		else
		{
			System.out.println("Sorry !!! Invalid OTP....");
		}
		
	}

}
