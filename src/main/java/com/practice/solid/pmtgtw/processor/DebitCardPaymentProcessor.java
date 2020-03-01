/**
 * 
 */
package com.practice.solid.pmtgtw.processor;

import com.practice.solid.pmtgtw.DebitCardPayment;

/**
 * @author ranjit soni
 *
 */
public class DebitCardPaymentProcessor {
	
	public void processPayment(DebitCardPayment debitCardPayment) {
		
		if(debitCardPayment.checkBankBalance(debitCardPayment)) {
			debitCardPayment.makePayment();
		}
		else {
			System.out.println("Sorry, Balance not available in Debit Card Account");
		}
	}
}
