package com.practice.solid.pmtgtw.app;

import com.practice.solid.pmtgtw.credit.impl.HDFDCreditCardPayment;
import com.practice.solid.pmtgtw.credit.impl.ICICCreditCardPayment;
import com.practice.solid.pmtgtw.debit.impl.HDFDDebitCardPayment;
import com.practice.solid.pmtgtw.debit.impl.ICICDebitCardPayment;
import com.practice.solid.pmtgtw.processor.CreditCardPaymentProcessor;
import com.practice.solid.pmtgtw.processor.DebitCardPaymentProcessor;

/**
 * @author ranjit soni
 *
 * This is Main Class.
 */
public class PaymentApp {
	
	public static void main(String[] args) {
		
		CreditCardPaymentProcessor cardPayment = new CreditCardPaymentProcessor();
		cardPayment.processPayment(new HDFDCreditCardPayment());
		cardPayment.processPayment(new ICICCreditCardPayment());
		
		DebitCardPaymentProcessor debitCardPaymentProcessor = new DebitCardPaymentProcessor();
		debitCardPaymentProcessor.processPayment(new HDFDDebitCardPayment());
		debitCardPaymentProcessor.processPayment(new ICICDebitCardPayment());
	}
}
