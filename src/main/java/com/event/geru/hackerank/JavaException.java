package com.event.geru.hackerank;

import java.util.Scanner;

/**
 * You will be given two integers and as input, you have to compute . If and are
 * not bit signed integers or if is zero, exception will occur and you have to
 * report it. Read sample Input/Output to know what to report in case of
 * exceptions.
 * 
 * 
 * @author vikram
 *
 */
public class JavaException {

	public static void main(String args[]) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		try {
			int x = sc.nextInt();
			int y = sc.nextInt();

			int result = x / y;

		} catch (java.lang.ArithmeticException e) {
			System.out.println(e.toString());
		} catch (Exception e) {
			System.out.println(e.toString().split(":")[0]);
		}
	}
}
