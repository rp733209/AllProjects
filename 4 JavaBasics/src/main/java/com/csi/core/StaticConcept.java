package com.csi.core;


public class StaticConcept {

	public static void main(String[] args) {
		StaticConcept concept = new StaticConcept();
		System.out.println("FULL STACK JAVA DEVELOPER");
		concept.show();
		get();
	}

	void show() {
		System.out.println("WELCOME");
	}

	static void get() {
		System.out.println("FINTECH CSI");
	}

	static {// static block it will execute before main method
		System.out.println("INDIA");
	}
}
