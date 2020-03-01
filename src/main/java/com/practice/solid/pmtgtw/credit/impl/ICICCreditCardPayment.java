/**
 * 
 */
package com.practice.solid.pmtgtw.credit.impl;

import com.practice.solid.pmtgtw.CreditCardPayment;

/**
 * @author ranjit soni
 *
 */
public class ICICCreditCardPayment implements CreditCardPayment {

	@Override
	public void makePayment() {
		System.out.println("Payment done through ICICI Card payment");
	}

	@Override
	public boolean checkCreditLimit() {
		System.out.println("Your ICICI Credit card Limit is ok...");
		return true;
	}
}
