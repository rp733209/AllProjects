package com.csi.jdk8;

import java.util.Set;

@FunctionalInterface // SAM
interface Product {
	void show(int n1, int n2);

	static void get() {

	}

	default void set() {

	}

	default void set(String name) {

	}
}

public class LambdaExpressionConcept {

	public static void main(String[] args) {

		Product product = (n1, n2) -> System.out.println(n1 + n2);

		product.show(8, 9);
	}

}
