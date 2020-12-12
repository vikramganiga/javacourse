package com.event.geru.leetcode;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Given a string s, find the length of the longest substring without repeating
 * characters.
 * 
 * @author vikram
 *
 */

public class UniqueSubString {

	public static Integer getSubString(String input) {

		LinkedHashSet<String> uniqueChar = new LinkedHashSet<>();
		HashMap<Integer, String> collectSubString = new HashMap<Integer, String>();
		Integer count = 0, charLength = 0, i = 0;

		while (i < input.length()) {

			boolean unique = uniqueChar.add("" + input.charAt(i));

			if (unique == false || ((i + 1) == input.length())) {
				String result = uniqueChar.stream().collect(Collectors.joining());
				collectSubString.put(count++, result);
				System.out.println("Unique char collection " + result);
				uniqueChar.clear();

				i = input.indexOf(input.charAt(i));

				input = input.substring(i + 1);

				i = 0;
			} else {
				i++;
			}
		}

		String result = uniqueChar.stream().collect(Collectors.joining());
		collectSubString.put(count++, result);
		uniqueChar.clear();

		for (Map.Entry<Integer, String> entry : collectSubString.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
			if (entry.getValue().length() > charLength)
				charLength = entry.getValue().length();
		}

		return charLength;
	}

	public static void main(String args[]) {
		System.out.print("Output " + getSubString("abdzdqkne"));
	}
}
