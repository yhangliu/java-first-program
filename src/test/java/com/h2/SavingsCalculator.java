package com.h2;
import java.time.LocalDate;
import java.time.YearMonth;

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
	private float sumOfDebits() {
		float sum = 0.0f;
		for(int i = 0;i < this.debits.length ;i++) {
			sum = sum + this.debits[i];
		}
		return sum;
	}
	
	private static int remainingDaysInMonth(LocalDate date) {
		YearMonth yearMonth = YearMonth.of(date.getYear(), date.getMonth());
		int totalDaysInMonth = yearMonth.lengthOfMonth();
		int remainingDays = totalDaysInMonth - date.getDayOfMonth();
		return remainingDays;
	}
	
	public float calculate() {
		
		return this.sumOfCredits() - this.sumOfDebits();
	}
	
	public static void main(String[] args) {
		
	}

}
