package com.csi.corecollection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class Customer implements Comparable<Customer> {

	int custId;

	String custName;

	int custAge;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int custId, String custName, int custAge) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custAge = custAge;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public int getCustAge() {
		return custAge;
	}

	public void setCustAge(int custAge) {
		this.custAge = custAge;
	}

	@Override
	public int compareTo(Customer c1) {
		// TODO Auto-generated method stub
		if (custAge == c1.getCustAge()) {
			return 0;
		} else if (custAge < c1.getCustAge()) {
			return 1;
		} else {
			return -1;
		}
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custAge=" + custAge + "]";
	}
	
	

}

public class ComparableConcept {

	public static void main(String[] args) {

		List<Customer> customers = new LinkedList<Customer>();

		customers.add(new Customer(121, "SWARA", 22));
		customers.add(new Customer(122, "LAKSHMI", 21));
		customers.add(new Customer(124, "RAM", 23));
		customers.add(new Customer(125, "VENKAT", 56));
		customers.add(new Customer(129, "SURAJ", 16));

		Collections.sort(customers);

		customers.forEach(System.out::println);

	}

}
