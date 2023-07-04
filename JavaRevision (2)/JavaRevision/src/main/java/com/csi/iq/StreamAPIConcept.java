package com.csi.iq;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee {
	private int empId;

	private String empName;

	private double empSalary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

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

public class StreamAPIConcept {

	public static void main(String[] args) {

		/*
		 * Stream.of(new Employee(121, "SWARAA", 65000), new Employee(122, "CHETAN",
		 * 45000), new Employee(123, "SACHIN", 95000), new Employee(124, "VEDANT",
		 * 35000), new Employee(125, "SURAJ",
		 * 50000)).collect(Collectors.toList()).stream() .filter(emp ->
		 * emp.getEmpSalary() >= 50000).forEach(System.out::println);
		 */

		/*
		 * Stream.of(new Employee(121, "SWARAA", 65000), new Employee(122, "CHETAN",
		 * 45000), new Employee(123, "SACHIN", 95000), new Employee(124, "VEDANT",
		 * 35000), new Employee(125, "SURAJ",
		 * 50000)).collect(Collectors.toList()).stream()
		 * .sorted(Comparator.comparingDouble(Employee::getEmpSalary).reversed()).
		 * forEach(System.out::println);
		 */

		/*
		 * double sumSalary = Stream .of(new Employee(121, "SWARAA", 65000), new
		 * Employee(122, "CHETAN", 45000), new Employee(123, "SACHIN", 95000), new
		 * Employee(124, "VEDANT", 35000), new Employee(125, "SURAJ", 50000))
		 * .collect(Collectors.toList()).stream().collect(Collectors.averagingDouble(
		 * Employee::getEmpSalary));
		 * 
		 * System.out.println(sumSalary);
		 */

		Employee employee = Stream
				.of(new Employee(121, "SWARA", 65000), new Employee(122, "CHETAN", 45000),
						new Employee(123, "SACHIN", 95000), new Employee(124, "VEDANT", 35000),
						new Employee(125, "SURAJ", 50000))
				.collect(Collectors.toList()).stream()
				.sorted(Comparator.comparingDouble(Employee::getEmpSalary).reversed()).collect(Collectors.toList())
				.get(1);

		System.out.println(employee.getEmpName() + ": " + employee.getEmpSalary());
	}

}
