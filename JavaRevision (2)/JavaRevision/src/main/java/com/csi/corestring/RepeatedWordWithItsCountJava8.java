package com.csi.corestring;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RepeatedWordWithItsCountJava8 {
	public static void main(String[] args) {

		List<String> list = Arrays.asList("Java", "React", "Python", "React");

		Map<String, Long> counterMap = list.stream()
				.collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));

		counterMap.forEach((k, v) -> {
			if (v > 1) {
				System.out.println(k + ": " + v);
			}
		});

	}

}
