package com.yash.Q7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question7 {
	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(1, 22, 33, 64, 80, 90);
		List<Integer> evenNumbers = l1.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());

		System.out.println(evenNumbers);
	}
}