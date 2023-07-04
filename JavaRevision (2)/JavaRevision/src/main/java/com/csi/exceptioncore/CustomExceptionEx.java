package com.csi.exceptioncore;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee {
	private int empId;

	private String empName;

	private double empSalary;

	public Employee(int empId, String empName, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}

}

public class CustomExceptionEx {
	public static void main(String[] args) throws RecordNotFoundException, NullPointerException, ArithmeticException {

		List<Employee> employees = Stream.of(new Employee(121, "SWARA", 96000), new Employee(122, "SURAJ", 45000),
				new Employee(124, "LAKSHMI", 15000), new Employee(126, "RAM", 95000),
				new Employee(129, "VENKAT", 55000)).collect(Collectors.toList());

		for (Employee employee : employees) {
			if (employee.getEmpId() == 111) {
				System.out.println("Employee: " + employee);
				break;
			} else {
				throw new RecordNotFoundException("Employee Record Not Found");
			}
		}
	}
}
