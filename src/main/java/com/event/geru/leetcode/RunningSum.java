package com.event.geru.leetcode;

public class RunningSum {

	public int[] runningSum(int[] nums) {
		int result[] = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			int j = 0, sum = 0;
			while (j <= i) {
				sum += nums[j];
				j++;
			}
			result[i] = sum;
		}
		return result;
	}

	public static void main(String args[]) {
		RunningSum runningSum = new RunningSum();
		int results[] = runningSum.runningSum(new int[] { 0, 3, 2, 2 });

		for (int i = 0; i < results.length; i++) {
			System.out.print(" " + results[i]);
		}
	}
}
