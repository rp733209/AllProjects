package com.csi.corecollection;

import java.util.Set;
import java.util.TreeSet;


public class TreeSetConcept {

	public static void main(String[] args) {

		Set employees = new TreeSet();
		Employee e1= new Employee(129, "SWARA", 22, 65000);
		Employee e2= new Employee(122, "RAM", 16, 95000);
		employees.add(e1.getEmpId());
		employees.add(e2.getEmpId());
		
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

		employees.forEach(emp -> System.out.println(emp));

		// employees.forEach(System.out::println);

		// employees.stream().filter(emp -> emp.getEmpSalary() >=
		// 50000).forEach(System.out::println);

		// employees.stream().sorted(Comparator.comparingInt(Employee::getEmpAge).reversed()).forEach(System.out::println);

		/*
		 * long count = employees.stream().collect(Collectors.counting());
		 * 
		 * System.out.println(count);
		 */

		/*
		 * employees.stream().sorted(Comparator.comparing(Employee::getEmpName).reversed
		 * ()) .forEach(emp -> System.out.println(emp.getEmpName()));
		 */

	}

}
