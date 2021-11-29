package com.greatlearning.service;

public class OTPGenerator {
	
	public int genrateOTP()
	{
		int randomPin = (int)Math.random()*9000 + 1000;
		return randomPin;
	}
	/*
	 * 0.5*9000=4500.0
	 * 0.7*9000=6300.0
	 */
	

}
