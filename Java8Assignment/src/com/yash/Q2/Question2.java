package com.yash.Q2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Question2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of marks");
		int n = scan.nextInt();
		List<Double> marks = new ArrayList<>();
		for (int i = 1; i <= n; i++) {

			System.out.println("Enter marks");
			double mark = scan.nextInt();

			marks.add(mark);

		}

		List<Double> distinctMarks = marks.stream().distinct().collect(Collectors.toList());

		for (double marking : distinctMarks) {

			System.out.println("distinct marks are " + marking);
		}

	}

}
