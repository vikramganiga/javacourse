package com.event.geru.problems;

import java.util.LinkedList;

/**
 * String s1 ="abc" String s2 ="cba"
 * 
 * return true if s2 is rotated string of s1
 * 
 * @author vikram
 *
 */
public class StringRotation {

	public static boolean isRotated(String s1, String rotated) {
		String result = s1 + s1;
		return result.contains(rotated);
	}

	public static boolean isRotatedSubString(String s1, String rotated) {

		if (s1.length() != rotated.length()) {
			return false;
		}

		int index = rotated.indexOf(s1.charAt(0));

		if (index == -1)
			return false;

		int finalPos = rotated.length() - index;

		return rotated.charAt(0) == s1.charAt(finalPos) && s1.substring(finalPos).equals(rotated.substring(0, index));
	}

	public static boolean isRotatedLinkedList(String s1, String rotated) {

		LinkedList<String> list = new LinkedList<>();
		for (int i = 0; i < s1.length(); i++) {
			list.add("" + s1.charAt(i));
		}

		int pos = list.indexOf("" + rotated.charAt(0));
		String result = "";
		for (int i = pos; i < list.size(); i++) {
			result = result + list.get(i);
		}

		for (int i = 0; i < pos; i++) {
			result = result + list.get(i);
		}

		System.out.println(result);

		if (result.contentEquals(rotated))
			return true;

		return false;
	}

	public static void main(String args[]) {
		String s1 = "1234";
		String s2 = "3412";

		System.out.println(isRotated(s1, s2));
		System.out.println(isRotatedSubString(s1, s2));
		System.out.println(isRotatedLinkedList(s1, s2));
	}
}
