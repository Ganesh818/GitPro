package com.test.git;

public class FactorialOfNum {

	public static void main(String[] args) {

		fact(5);
	}

	public static void fact(int number) {

		int i;
		int num = 1;

		for (i = number; i > 0; i--) {

			num = num * i;

		}

		System.out.println(num);

	}
}
