package com.h2;

public class SavingsCalculator {
	private float[] credits,debits;
	public SavingsCalculator(float[] credits, float[] debits){
		this.credits = credits;
		this.debits = debits;
	}
	private float sumOfCredits() {
		float sum = 0.0f;
		for(int i = 0;i < this.credits.length ;i++) {
			sum = sum + this.credits[i];
		}
		return sum;
	}

}
