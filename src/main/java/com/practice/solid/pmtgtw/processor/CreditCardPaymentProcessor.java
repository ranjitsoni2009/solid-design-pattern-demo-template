package com.practice.solid.pmtgtw.processor;

import com.practice.solid.pmtgtw.CreditCardPayment;

public class CreditCardPaymentProcessor {
	
	public void processPayment(CreditCardPayment creditCardPayment) {
		
		if(creditCardPayment.checkCreditLimit()) {
			creditCardPayment.makePayment();			
		}
		else {
			System.out.println("Sorry, CreditLimit is not available");
		}
	}
}
