package com.h2;

public class MortgageCalculator {
	
	private long loanAmount;
	private int termInYears;
	private float annualRate;
	private double monthlyPayment;
	
	public MortgageCalculator(long loanAmount, int termInYears, float annualRate) {
		this.loanAmount = loanAmount;
		this.termInYears = termInYears;
		this.annualRate = annualRate;	
	}
	
	private int getNumberOfPayments() {
		return this.termInYears * 12;
	}
	
	private float getMonthlyInterestRate() {
		float interestRate = (this.annualRate/100)/12;
		return interestRate;
	}
	
	public void calculateMonthlyPayment() {
		long P = this.loanAmount;
		float r = getMonthlyInterestRate();
		int n = getNumberOfPayments();
		double M = P * (((r * Math.pow(1 + r, n))) / ((Math.pow((1 + r), n)) - 1));
		this.monthlyPayment = M;
		
	}

}
