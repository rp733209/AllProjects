package com.csi.core;

final class Dept {
	final void set(int empId, String empName) {

	}
}

class Emp  {
	/*
	 * void set(int empId, String empName) {//Cant Override
	 * 
	 * }
	 */
}

public class FinalConcept {

	final int empCode = 121;

	public static void main(String[] args) {

		FinalConcept concept = new FinalConcept();
		concept.show();
	}

	void show() {
		// empCode = 999;
		System.out.println(empCode);
	}

}
