package com.csi.core;

import java.util.Scanner;

public class ForLoopConcept {
	public static void main(String[] args) {

		System.out.println("\n Please enter company name & how many times you want to print: ");
		
		Scanner scanner = new Scanner(System.in);
		String cName = scanner.nextLine();
		int n = scanner.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println(cName);
		}

	}
}
