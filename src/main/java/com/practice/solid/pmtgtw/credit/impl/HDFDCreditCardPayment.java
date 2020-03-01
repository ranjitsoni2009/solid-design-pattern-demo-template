package com.practice.solid.pmtgtw.credit.impl;

import com.practice.solid.pmtgtw.CreditCardPayment;

public class HDFDCreditCardPayment implements CreditCardPayment {
	
	@Override
	public void makePayment() {
		System.out.println("Payment done through HDFC Card payment...");
	}

	@Override
	public boolean checkCreditLimit() {
		System.out.println("Your HDFC Credit card Limit is ok...");
		return true;
	}
}
