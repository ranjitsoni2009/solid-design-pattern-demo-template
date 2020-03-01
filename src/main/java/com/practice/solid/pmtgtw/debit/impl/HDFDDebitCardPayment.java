/**
 * 
 */
package com.practice.solid.pmtgtw.debit.impl;

import com.practice.solid.pmtgtw.DebitCardPayment;

/**
 * @author ranjit soni
 *
 */
public class HDFDDebitCardPayment implements DebitCardPayment {

	@Override
	public void makePayment() {
		System.out.println("Payment done successfully using HDFD Debit Card...");
	}

	@Override
	public boolean checkBankBalance(DebitCardPayment debitCardPayment) {
		return true;
	}
}
