package com.event.geru.hackerank;

import java.util.Scanner;

public class ReadingInputScanner {

	public static void main(String args[]) {

		/*
		 * This reads the input provided by user using keyboard
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter any number: ");

		int num = scan.nextInt();

		// while) {

		while (scan.hasNextLine()) {
			System.out.print("Enter any number: " + scan.nextInt());
		}

		num--;
	}

	// Closing Scanner after the use
	// scan.close();

	// Displaying the number
	// System.out.println("The number entered by user: "+num);

	// }

}
