package com.csi.core;

class Department {
	void get() {
		System.out.println("I am from dept");
	}
}

class Employee extends Department {
	void show() {
		System.out.println("I am from emp");
	}
}

public class InheritanceConcept {
	public static void main(String[] args) {
		Department employee = new Employee();
		employee.get();
		((Employee) employee).show();
	}
}
