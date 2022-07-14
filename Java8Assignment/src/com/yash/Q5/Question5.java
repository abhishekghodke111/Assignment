package com.yash.Q5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Question5 {
	public static void main(String[] args) {

		List<String> employee = Arrays.asList("abhishek", "ajinkya", "namdev", "mansi", "prakash", "swapnali");
		Comparator<String> compByLength = (aname, bname) -> aname.length() - bname.length();
		employee.stream().max(compByLength)
				.ifPresent(longest -> System.out.println(" \n The longest name is " + longest));
	}
}