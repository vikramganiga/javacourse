package com.event.geru.interview.netcraker;

import java.util.Scanner;

public class CheckPalindrome {

	public static void reverse(String input) {
		String reverse = "";

		for (int i = input.length() - 1; i >= 0; i--) {
			reverse += "" + input.charAt(i);
		}

		if (reverse.contentEquals(input)) {
			System.out.println("palindrome - " + reverse);
		} else {
			System.out.println("not palindrome - " + reverse);
		}

	}

	public static String recursive(String word) {

		if (word.isEmpty())
			return word;

		return recursive(word.substring(1)) + word.charAt(0);
	}

	public static void main(String args[]) {

		Scanner r = new Scanner(System.in);
		String input = r.nextLine();

		// reverse(input);
		String output = recursive(input);

		if (output.contentEquals(input)) {
			System.out.println("palindrome - " + output);
		} else {
			System.out.println("not palindrome - " + input);
		}

	}

}
