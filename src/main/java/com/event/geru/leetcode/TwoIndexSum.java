package com.event.geru.leetcode;

/**
 * Given an array of integers nums and an integer target, return indices of the
 * two numbers such that they add up to target
 * 
 * Input: nums = [2,7,11,15], target = 9 Output: [0,1] Output: Because nums[0] +
 * nums[1] == 9, we return [0, 1].
 *
 */
public class TwoIndexSum {

	public static void main(String args[]) {

		int integerArray[] = { 3, 2, 4 };
		int results[] = new int[2];
		int targetSum = 6;
		int i, j = 0;
		// boolean result = false;
		outerloop: for (i = 0; i < integerArray.length; i++) {
			for (j = i + 1; j < integerArray.length; j++) {
				if (integerArray[i] + integerArray[j] == targetSum) {
					results[0] = i;
					results[1] = j;
					// result = true;
					break outerloop;
				}
			}
		}

		System.out.print(results[0] + " " + results[1]);

	}

}
