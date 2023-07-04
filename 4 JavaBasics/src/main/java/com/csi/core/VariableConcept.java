package com.csi.core;

public class VariableConcept {

	int empId = 121;// Instance Variable

	static String companyName = "TCS";// Static Variable

	public static void main(String[] args) {
		
		VariableConcept concept = new VariableConcept();
		concept.show();
	}

	void show() {
		double empSalary = 99500;// Local Variable

		System.out.println(
				"\n Employee Id: " + empId + "\n Company Name: " + companyName + "\n Employee Salary: " + empSalary);

	}

}
