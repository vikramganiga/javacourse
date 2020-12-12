package com.event.geru.java8.behavior.parameterization;

import java.util.ArrayList;
import java.util.List;

import com.event.geru.java8.Apple;

public class PassingCode {

	public static List<Apple> filterApple(List<Apple> inventory, ApplePredicate p) {
		List<Apple> result = new ArrayList<>();

		for (Apple apple : inventory) {
			if (p.test(apple)) {
				result.add(apple);
			}
		}

		return result;
	}

	public static void FormatApplePrint(List<Apple> inventory, AppleFormatter p) {
		List<Apple> result = new ArrayList<>();

		for (Apple apple : inventory) {
			System.out.println(" " + p.print(apple));
		}

	}

	public static void main(String args[]) {
		Apple apple = new Apple("green", 101);
		Apple apple2 = new Apple("red", 120);

		List<Apple> inventory = new ArrayList<>();
		inventory.add(apple);
		inventory.add(apple2);

		// System.out.println(filterApple(inventory, Apple::isGreenApple));
		System.out.println(filterApple(inventory, new AppleGreenColorPredicate()));

		FormatApplePrint(inventory, new AppleColorPrinter());

		// System.out.println(inventory.stream().filter((Apple ab) -> ab.getWeight()
		// >0).collect(Collectors.toList()));
	}
}
