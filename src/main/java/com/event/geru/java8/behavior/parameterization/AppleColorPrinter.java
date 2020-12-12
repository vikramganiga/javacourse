package com.event.geru.java8.behavior.parameterization;

import com.event.geru.java8.Apple;

public class AppleColorPrinter implements AppleFormatter {

	@Override
	public String print(Apple apple) {
		return apple.getColor();
	}

}
