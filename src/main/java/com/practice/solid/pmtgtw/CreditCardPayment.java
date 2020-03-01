/**
 * 
 */
package com.practice.solid.pmtgtw;

/**
 * @author ranjit soni
 * 
 * This Interface extends Payment Interface and being implemented by HDFDCreditCardPayment, ICICCreditCardPayment class.
 *
 */
public interface CreditCardPayment extends Payment {
	
	public boolean checkCreditLimit();

}
