package com.ujianke2oop.module;

public class Income {
	String incomeType;
	double amount;
	double tax;
	double totalTax;

	public Income(String incomeType, double amount, double tax, double totalTax) {
		this.incomeType = incomeType;
		this.amount = amount;
		this.tax = tax;
		this.totalTax = totalTax;
	}

	public String getIncomeType() {
		return incomeType;
	}

	public double getAmount() {
		return amount;
	}

	public double getTax() {
		return tax;
	}

	public double getTotalTax() {
		return (getTax() / 100) * getAmount();
	}
}
