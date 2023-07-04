package com.csi.core;

public class StaticCoreConcept {
	public static void main(String[] args) {
		System.out.println("WELCOME");
		StaticCoreConcept concept = new StaticCoreConcept();
		concept.show();
		display();
	}

	void show() {
		System.out.println("CSI PUNE");
	}

	static void display() {
		System.out.println("INDIA");
	}

	static {
		System.out.println("FULL STACK");
	}
}
