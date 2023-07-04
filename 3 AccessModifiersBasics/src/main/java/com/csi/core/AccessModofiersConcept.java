package com.csi.core;

class Employee {
	private int empId = 121;

   protected String empName = "SWARA";

   void show() {
	   
   }
}

public class AccessModofiersConcept {
	public static void main(String[] args) {

		Employee employee = new Employee();
		
		BaseApp app = new BaseApp();
		
		System.out.println(app.empCode);

		System.out.println(employee.empName);
	}
}
