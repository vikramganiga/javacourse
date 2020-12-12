package com.event.geru.hackerank;

import java.io.IOException;

/**
 * Problem -
 * 
 * Given a 2D Array - Calculate the hourglass sum for every hourglass in , then
 * print the maximum hourglass sum.
 * 
 * @author vikram
 *
 */

public class TwoDArraysHourGlass {

	// Complete the hourglassSum function below.
	static int hourglassSum(int[][] arr) {
		int sum = 0, temp = 0, count = 0;
		System.out.println(" Array length " + arr.length);
		for (int i = 0; i <= (arr.length - 3); i++) {
			temp = 0;

			for (int j = 0; j <= (arr.length - 3); j++) {
				// System.out.println ("HourGlass ");

				temp = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1]
						+ arr[i + 2][j + 2];

				// System.out.println ( arr[i][j]+ " "+ arr[i][j+1]+ " "+ arr[i][j+2]);
				// System.out.println (" "+arr[i+1][j+1]);
				// System.out.println (arr[i+2][j]+" "+ arr[i+2][j+1]+ " "+ arr[i+2][j+2]);

				System.out.println(temp);

				if (count == 0)
					sum = temp;

				if ((count != 0) && (temp > sum))
					sum = temp;

				count++;
			}

		}

		return sum;

	}

	// private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		int[][] arr = { { 1, 1, 1, 0, 0, 0 }, { 0, 1, 0, 0, 0, 0 }, { 1, 1, 1, 0, 0, 0 }, { 0, 0, 2, 4, 4, 0 },
				{ 0, 0, 0, 2, 0, 0 }, { 0, 0, 1, 2, 4, 0 } };

		int[][] arr1 = { { -1, -1, 0, -9, -2, -2 }, { -2, -1, -6, -8, -2, -5 }, { -1, -1, -1, -2, -3, -4 },
				{ -1, -9, -2, -4, -4, -5 }, { -7, -3, -3, -2, -9, -9 }, { -1, -3, -1, -2, -4, -5 } };

		int result = hourglassSum(arr1);
		System.out.println(result);

		// bufferedWriter.write(String.valueOf(result));
		// bufferedWriter.newLine();

		// bufferedWriter.close();

		// scanner.close();
	}
}
