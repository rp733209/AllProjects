package com.csi.corecollection;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class NameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return e1.getEmpName().compareTo(e2.getEmpName());
	}

}

class AgeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		if (e1.getEmpAge() == e2.getEmpAge()) {
			return 0;
		} else if (e1.getEmpAge() > e2.getEmpAge()) {
			return 1;
		} else {
			return -1;
		}
	}

}

public class ComparatorConcept {

	public static void main(String[] args) {

		List<Employee> employees = new LinkedList<Employee>();

		employees.add(new Employee(121, "SWARA", 22, 65000));
		employees.add(new Employee(122, "RAM", 16, 95000));
		employees.add(new Employee(123, "LAKSHMI", 26, 45000));
		employees.add(new Employee(127, "GAYATRI", 32, 50000));
		employees.add(new Employee(129, "SURAJ", 21, 75000));

		System.out.println("\n Name Comparator: ");
		Collections.sort(employees, new NameComparator());
		employees.forEach(System.out::println);

		System.out.println("\n Age Comparator: ");
		Collections.sort(employees, new AgeComparator());
		employees.forEach(System.out::println);
	}

}
