package com.ujianke2oop.main;

import java.util.Scanner;

import com.ujianke2oop.module.Income;
import com.ujianke2oop.module.Staff;

public class StaffIncomeReport {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Masukkan Nama : ");
		String name = scanner.next();
		System.out.print("Masukkan ID : ");

		String id = scanner.next();
		System.out.print("Masukkan Jenis Pendapatan : ");
		String incomeType = scanner.next();

		System.out.print("Masukkan Jumlah Pendapatan = ");
		double amount = scanner.nextDouble();

		System.out.print("Masukkan Persentase Pajak Penghasilan = ");
		double tax = scanner.nextDouble();

		Income income = new Income(incomeType, amount, tax, 0);
		Staff staff = new Staff(name, id, income);

		staff.StaffInfo();
		staff.displayIncomeInfo();
	}

}
