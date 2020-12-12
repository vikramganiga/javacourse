package com.event.geru.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PassingCode {

	public static List<Apple> filterApple(List<Apple> inventory, Predicate<Apple> p) {
		List<Apple> result = new ArrayList<>();

		for (Apple apple : inventory) {
			if (p.test(apple)) {
				result.add(apple);
			}
		}

		return result;
	}

	public static void main(String args[]) {
		Apple apple = new Apple("green", 101);
		Apple apple2 = new Apple("red", 120);

		List<Apple> inventory = new ArrayList<>();
		inventory.add(apple);
		inventory.add(apple2);

		System.out.println(filterApple(inventory, Apple::isGreenApple));
		System.out.println(filterApple(inventory, (Apple a) -> a.getWeight() > 0));

		System.out.println(inventory.stream().filter((Apple ab) -> ab.getWeight() > 0).collect(Collectors.toList()));
	}
}
