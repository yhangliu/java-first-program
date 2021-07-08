package com.h2;

public class MortgageCalculator {
	
	private long loanAmount;
	private int termInYears;
	private float annualRate;
	private double monthlyPayment;
	
	public MortgageCalculator(long loanAmount, int termInYears, float annualRate) {
		long loanAmount = this.loanAmount;
		int termInYears = this.termInYears;
		float annualRate = this.annualRate;	
	}
	
	private int getNumberOfPayments() {
		return this.termInYears * 12;
	}

}
