package com.event.geru.test.leecode;

import org.junit.Assert;
import org.junit.Test;

import com.event.geru.leetcode.RunningSum;

public class RunningSumTest {
	
	@Test
    public void validData() {
		
		RunningSum runningSum = new RunningSum();
		int results[] =runningSum.runningSum(new int[] {0,3,2,2});
		
		Assert.assertArrayEquals("Failed Running Sum",new int[] {0,3,5,7},  results);
		
	}
	
	@Test
    public void validRepeatedData() {
		
		RunningSum runningSum = new RunningSum();
		int results[] =runningSum.runningSum(new int[] {1,1,1,1,1});
		
		Assert.assertArrayEquals("Failed Running Sum",new int[] {1,2,3,4,5},  results);
		
	}
	
	@Test
    public void validComplextData() {
		
		RunningSum runningSum = new RunningSum();
		int results[] =runningSum.runningSum(new int[] {3,1,2,10,1});
		
		Assert.assertArrayEquals("Failed Running Sum",new int[] {3,4,6,16,17},  results);
		
	}
	
}
