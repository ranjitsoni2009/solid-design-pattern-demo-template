package com.practice.solid.pmtgtw;

/**
 * @author ranjit soni
 *
 * This is Super Interface, which contains abstract method makePayment() for all kind of payment like Credit Card,
 * Debit Card, wallet etc.
 * This Interface is being extend by CreditCardPayment, DebitCardPayment interface.
 */
public interface Payment {
	
	public void makePayment();
}
