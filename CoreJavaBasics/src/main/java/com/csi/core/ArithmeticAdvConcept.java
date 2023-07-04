package com.csi.core;

public class ArithmeticAdvConcept {

	public static void main(String[] args) {

		ArithmeticAdvConcept concept = new ArithmeticAdvConcept();

		add(20, 10);
		System.out.println("\n Substraction Result: " + concept.sub(4, 2));
		System.out.println("\n Multiplication Result: " + mul(3, 4));
		System.out.println("\n Division Result: " + concept.div(100, 25));

	}

 	static void add(int n1, int n2) {

		System.out.println("\n Addition Result: " + ((n1 + n2)));
	}

	int sub(int n1, int n2) {

		return n1 - n2;

	}

	static double mul(int n1, int n2) {
		return n1 * n2;
	}

	int div(int n1, int n2) {
		return n1 / n2;
	}

}
