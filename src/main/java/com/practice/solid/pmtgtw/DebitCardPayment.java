/**
 * 
 */
package com.practice.solid.pmtgtw;

/**
 * @author ranjit soni
 * 
 * This Interface extends Payment Interface and being implemented by HDFDDebitCardPayment, ICICDebitCardPayment class.
 *
 */
public interface DebitCardPayment extends Payment {
	
	public boolean checkBankBalance(DebitCardPayment debitCardPayment);
}
