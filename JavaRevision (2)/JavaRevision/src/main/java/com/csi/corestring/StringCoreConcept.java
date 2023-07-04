package com.csi.corestring;

public class StringCoreConcept {

	public static void main(String[] args) {
		String s1 = "Fintech";
		String s2 = new String("Fintech");

		System.out.println(s1 == s2);

		System.out.println(s1.equals(s2));
	}

}
