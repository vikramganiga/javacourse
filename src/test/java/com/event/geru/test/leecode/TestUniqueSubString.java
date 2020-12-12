package com.event.geru.test.leecode;

import org.junit.Assert;
import org.junit.Test;

import com.event.geru.leetcode.UniqueSubString;

public class TestUniqueSubString {
	
	@Test
	public void testEmptyString()
	{
		Assert.assertEquals("Test failed for empty string", new Long(0),  new Long(UniqueSubString.getSubString("")));
		
	}
	
	@Test
	public void testEmpty()
	{
		Assert.assertEquals("Test failed for space string", new Long(1),  new Long(UniqueSubString.getSubString(" ")));
		
	}
	@Test
	public void testRepeatedString()
	{
		Assert.assertEquals("Test failed for repeated char in string", new Long(4),  new Long(UniqueSubString.getSubString("abbzbcnc")));
		
	}
	@Test
	public void testUniqueString()
	{
		Assert.assertEquals("Test failed for non repeacted char in string", new Long(5),  new Long(UniqueSubString.getSubString("qwert")));
		
	}
	
}
