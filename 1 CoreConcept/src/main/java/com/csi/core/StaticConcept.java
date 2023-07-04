package com.csi.core;

class Employee {
	static class Product {
	}
}

public class StaticConcept {
	public static void main(String[] args) {
		StaticConcept concept=null;
		
	
		concept= new StaticConcept();
		concept.show();
		display();
	}

	void show() {
		System.out.println("INDIA");
		
	}

	static void display() {
		System.out.println("CSI PUNE");
	}

	static {
		System.out.println("REACT JS");
	}
}
