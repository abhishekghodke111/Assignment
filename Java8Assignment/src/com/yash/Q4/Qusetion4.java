package com.yash.Q4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Qusetion4 {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(100, 245, 454, 987, 2334, 647);
		int av = (int) intList.stream().mapToInt(val -> val).max().getAsInt();
		System.out.println("Maximum number found to be:" + av);
	}

}
