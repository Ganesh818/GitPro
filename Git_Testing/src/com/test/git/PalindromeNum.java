package com.test.git;

public class PalindromeNum {

	public static void main(String[] args) {

		int num = 121212;
		int temp = num;
		int rem = 0;
		int rev = 0;

		while (num > 0) {

			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;

		}

		if (rev == temp) {
			System.out.println(temp + " is a palindrome.");
		} else {

			System.out.println(temp + " isn't a palindrome.");
		}

	}

}
