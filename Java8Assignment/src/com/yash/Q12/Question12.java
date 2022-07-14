package com.yash.Q12;

interface A {
	void max(int a[]);
}

public class Question12 {
	public static void main(String[] args) {
		A aa = (a) -> {
			int n = a.length;
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					if (a[i] > a[j]) {
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
			System.out.println("Maximum NO : " + a[n - 1]);
			for (int k = 1; k <= 5; k++) {
				System.out.println("Largest : " + k + " " + a[n - k]);
			}
		};

		int a[] = { 12, 67, 8, 78, 45 };
		aa.max(a);
	}

}
