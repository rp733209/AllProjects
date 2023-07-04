package com.csi.iq;

public class ReverseStringConcept {

	public static void main(String[] args) {

		String companyName = "Fintech";
		for (int i = companyName.length() - 1; i >= 0; i--) {
			System.out.print(companyName.charAt(i));
		}
	}

}
