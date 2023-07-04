package com.csi.iq;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatedCharacterWithJava8 {

	public static void main(String[] args) {

		String name = "Ahemednagar";

		Map<Character, Long> counterMap = name.toLowerCase().chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		counterMap.forEach((k, v) -> {
			if (v > 1) {
				System.out.println(k + ": " + v);
			}
		});
	}

}
