package com.csi.corecollection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx {
	
	public static void main(String[] args) {
		Map<Integer, Employee> hashMap = new LinkedHashMap<Integer, Employee>();

		Employee employee1 = new Employee(191, "SWARA", 22, 65000);
		Employee employee2 = new Employee(122, "RAM", 16, 95000);
		Employee employee3 = new Employee(123, "LAKSHMI", 26, 45000);
		Employee employee4 = new Employee(127, "GAYATRI", 32, 50000);
		Employee employee5 = new Employee(129, "SURAJ", 21, 75000);

		hashMap.put(employee1.getEmpId(), employee1);
		hashMap.put(employee2.getEmpId(), employee2);
		hashMap.put(employee3.getEmpId(), employee3);
		hashMap.put(employee4.getEmpId(), employee4);
		hashMap.put(employee5.getEmpId(), employee5);
		hashMap.put(null, employee5);
		hashMap.put(null, employee2);

		/*
		 * for (Map.Entry<Integer, Employee> m : hashMap.entrySet()) {
		 * if(m.getValue().getEmpSalary()>=50000) { System.out.println(m.getKey() + ": "
		 * + m.getValue()); } }
		 */

		hashMap.forEach((k, v) -> {

			System.out.println(k + ": " + v);

		});

	}

}
