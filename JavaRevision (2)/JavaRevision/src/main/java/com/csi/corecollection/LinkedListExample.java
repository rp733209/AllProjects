package com.csi.corecollection;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	
	public static void main(String[] args) {

		List<Employee> employees = new LinkedList<Employee>();

		
		employees.add(new Employee(121, "SWARA", 22, 65000));
		employees.add(new Employee(122, "RAM", 16, 95000));
		employees.add(new Employee(123, "LAKSHMI", 26, 45000));
		employees.add(new Employee(127, "GAYATRI", 32, 50000));
		employees.add(new Employee(129, "SURAJ", 21, 75000));

		/*
		 * Iterator<Employee> iterator = employees.iterator();
		 * 
		 * while (iterator.hasNext()) { employees.remove(2);
		 * System.out.println(iterator.next()); }
		 */

		/*
		 * for(Employee employee: employees) {
		 * 
		 * if(employee.getEmpSalary()>=50000) { System.out.println(employee); } }
		 */

		// employees.forEach(emp-> System.out.println(emp));

		// employees.forEach(System.out::println);

		// employees.stream().filter(emp -> emp.getEmpSalary() >=
		// 50000).forEach(System.out::println);

		// employees.stream().sorted(Comparator.comparingInt(Employee::getEmpAge).reversed()).forEach(System.out::println);

		/*
		 * long count = employees.stream().collect(Collectors.counting());
		 * 
		 * System.out.println(count);
		 */

		employees.stream().sorted(Comparator.comparing(Employee::getEmpName).reversed())
				.forEach(emp -> System.out.println(emp.getEmpName()));

	}

}
