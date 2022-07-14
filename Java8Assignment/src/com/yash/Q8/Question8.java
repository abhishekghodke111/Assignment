package com.yash.Q8;

@FunctionalInterface
interface EvenOddd {
	void check(int a);
}

public class Question8 {

	public static void main(String[] args) {

		EvenOddd evenOdd = new EvenOddd() {
			public void check(int a) {
				if (a % 2 == 0) {
					System.out.println("number " + a + " :is even");
				} else {
					System.out.println("number " + a + " :is odd");
				}
			}
		};

		evenOdd.check(10);
		evenOdd.check(13);

	}
}
