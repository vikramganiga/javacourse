package com.event.geru.problems;

import java.util.HashMap;

public class RepeatedCharacter {

	public static void main(String args[]) {

		String s = "STress";

		String caps = s.toUpperCase();

		HashMap<Character, Integer> counts = new HashMap<>();

		for (int i = 0; i < caps.length(); i++) {

			Character v = caps.charAt(i);

			if (counts.containsKey(v)) {
				counts.put(v, counts.get(v) + 1);
			} else {
				counts.put(v, 1);
			}
		}

		for (int i = 0; i < s.length(); i++) {
			Character v = s.toUpperCase().charAt(i);
			if (counts.get(v) == 1) {
				System.out.println("" + s.charAt(i));
			}

		}

	}
}
