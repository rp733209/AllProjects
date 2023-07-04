package com.csi.core;

public class ArithmeticApplication {

	public static void main(String[] args) {
		ArithmeticApplication arithmeticApplication = new ArithmeticApplication();

		arithmeticApplication.add(4, 5);

		System.out.println("\n Substraction Result: " + arithmeticApplication.sub(20, 10));

		System.out.println("\n Multiplication Result: " + arithmeticApplication.mul(4, 5));

		System.out.println("\n Division Result: " + arithmeticApplication.div(20, 10));

	}

	void add(int n1, int n2) {
		System.out.println("\n Addition Result: " + ((n1 + n2)));
	}

	int sub(int n1, int n2) {
		return n1 - n2;
	}

	 int mul(int n1, int n2) {
		return n1 * n2;
	}

	double div(double n1, double n2) {
		return n1 / n2;
	}

}
