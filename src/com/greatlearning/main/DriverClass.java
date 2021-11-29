package com.greatlearning.main;
import java.util.Scanner;

import com.greatlearning.model.Customer;
import com.greatlearning.service.Banking;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer customer1=new Customer("IND54321","pass4321");
		Scanner scan1=new Scanner(System.in);
		
		Banking banking=new Banking();
		
		String bankAcctNo;
		String pswd;
		
		
		System.out.println("Enter Your Bank Account Number");
		//Accepting user bank details- credentials 
		bankAcctNo=scan1.next();
		System.out.println("Enter Your Password");
		pswd=scan1.next();
		
		if(customer1.getBankAccountNo().equals(bankAcctNo) && customer1.getPassword().equals(pswd))
		{
		System.out.println("Welcome to Indian Bank Automatedd System...");
		int choice;
		do
		{
		System.out.println("------------ Main Menu ------------");
		System.out.println("1.Deposit Ammount");
		System.out.println("2.Withdraw Ammout");
		System.out.println("3.Fund Transfer");
		System.out.println("0.Exit");
		System.out.println("Please Enter Your Choice");
		choice=scan1.nextInt(); 
	
		switch(choice)
		{
		case 0:
		{
			choice=0;
			System.out.println("Exiting Main Menu......");
			break;
		}
		case 1:
		{
			banking.deposit();
			break;
		}
		case 2:
		{
			banking.withdraw();
			break;
		}
		case 3:
		{
			banking.transferFund();
			break;
		}
		default:
		{
			System.out.println("Sorry Invalid Choice...");
			break;
		}
		}
		
		
		System.out.println("----------End Of Main Manu----------");

		}while(choice !=0);
		System.out.println("Exited Menu Successfully....");
		}
		else
		{
			System.out.println("Sorry Invalid Credentaials....");
		}

	}

}
