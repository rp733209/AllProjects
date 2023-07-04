package com.csi.core;

public class SwapNumberWithout3rdVariable {

	public static void main(String[] args) {

		int n1 = 77, n2 = 55;

		n1 = n1 + n2;

		n2 = n1 - n2;

		n1 = n1 - n2;

		System.out.println("\n After Swap: " + "\n n1: " + n1 + "\n n2: " + n2);
	}

}
