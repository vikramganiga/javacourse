package com.event.geru.hackerank;

import java.io.IOException;
import java.util.Stack;

/**
 * A left rotation operation on an array shifts each of the array's elements
 * unit to the left.
 * 
 * @author vikram
 *
 */

public class ArryLefRotation {

	// Complete the rotLeft function below.
	static int[] rotLeft(int[] a, int d) {

		Stack<Integer> rotate = new Stack<Integer>();
		int result[] = new int[a.length];

		for (int i = 0; i < a.length && i < d; i++) {
			System.out.println("Stack " + a[i]);
			rotate.push(a[i]);

		}
		int j = 0;
		for (int i = d; i < a.length; i++, j++) {
			System.out.println("Remains " + a[i]);
			result[j] = a[i];
		}

		for (int i = 0; i < rotate.size(); i++) {
			int temp = rotate.get(i);
			System.out.println(" pop " + temp);
			result[j++] = temp;
		}

		return result;
	}

	// private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		// String[] nd = scanner.nextLine().split(" ");

		// int n = Integer.parseInt(nd[0]);

		// int d = Integer.parseInt(nd[1]);

		// int[] a = new int[n];

		// String[] aItems = scanner.nextLine().split(" ");
		// scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		// for (int i = 0; i < n; i++) {
		// int aItem = Integer.parseInt(aItems[i]);
		// a[i] = aItem;
		// }

		int[] a = { 1, 2, 3, 4, 5 };
		int d = 4;
		int[] result = rotLeft(a, d);

		System.out.println("Result");

		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

		// for (int i = 0; i < result.length; i++) {
		// bufferedWriter.write(String.valueOf(result[i]));

		// if (i != result.length - 1) {
		// bufferedWriter.write(" ");
		// }
		// }

		// bufferedWriter.newLine();

		// bufferedWriter.close();

		// scanner.close();
	}
}
