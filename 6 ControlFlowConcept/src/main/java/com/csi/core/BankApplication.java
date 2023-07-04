package com.csi.core;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {

		long custAccountNumber = 12345;

		String custPassword = "CSI@123";

		Scanner scanner = new Scanner(System.in);

		boolean flag = false;

		do {
			System.out.println("\n Please enter acc no & pwd: ");

			long accNo = scanner.nextLong();

			String custPwd = scanner.next();

			if (custAccountNumber == accNo && custPassword.equals(custPwd)) {
				System.out.println("WELCOME TO INDIAN BANK");
				flag = false;
			} else {
				System.out.println("Oops Please try again!!!!!");
				flag = true;
			}
		} while (flag);

		System.out.println("\n Please enter your choice: \n 1. Deposit \n 2. Withdraw \n 3. Transfer \n 4. Logout");
	}

}
