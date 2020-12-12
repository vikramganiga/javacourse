package com.event.geru.test.hackerrank;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.event.geru.hackerank.Java1DArray;

public class TestJava1DArray {

	@Test
	public void test1() {

		Java1DArray java1dArray = new Java1DArray();

		int leap = 3;
		int game[] = new int[] { 0, 0, 0, 0, 0 };

		assertEquals(true, java1dArray.canWin(leap, game));
	}

	@Test
	public void test2() {

		Java1DArray java1dArray = new Java1DArray();

		int leap = 5;
		int game[] = new int[] { 0, 0, 0, 1,1,1 };

		assertEquals(true, java1dArray.canWin(leap, game));

	}
	
	@Test
	public void test3() {
		
		Java1DArray java1dArray = new Java1DArray();

		int leap = 3;
		int game[] = new int[] { 0, 0, 1,1,1, 0 };

		assertEquals(false, java1dArray.canWin(leap, game));
	}
	
	@Test
	public void test4() {
		
		Java1DArray java1dArray = new Java1DArray();

		int leap = 1;
		int game[] = new int[] { 0, 1, 0 };

		assertEquals(false, java1dArray.canWin(leap, game));
	}

}
