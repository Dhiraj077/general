package com.greatlearning.model;

public class Customer {
	String bankAccountNo;
	String password;
	
	public Customer(String bankAccountNo, String password) {
		super();
		this.bankAccountNo = bankAccountNo;
		this.password = password;
	}

	public String getBankAccountNo() {
		return bankAccountNo;
	}

	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
