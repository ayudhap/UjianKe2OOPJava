package com.ujianke2oop.module;

import java.text.NumberFormat;
import java.util.Locale;

public class Staff {
	String name;
	String id;
	Income income;

	public Staff(String name, String id, Income income) {
		this.name = name;
		this.id = id;
		this.income = income;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public double calculateNetIncome() {
		return income.getAmount() - income.getTotalTax();
	}

	public void StaffInfo() {
		System.out.println("Nama : " + getName());
		System.out.println("ID : " + getId());
	}

	public void displayIncomeInfo() {
		System.out.println("Jenis Pendapatan : " + income.getIncomeType());
		System.out.println("Jumlah Pendapatan : " + income.getAmount());
		System.out.println("Pajak = " + income.getTax() + "%");
		System.out.println("Total Pajak = " + income.getTotalTax());
		System.out.println("Pendapatan Bersih = " + calculateNetIncome());
	}
}
