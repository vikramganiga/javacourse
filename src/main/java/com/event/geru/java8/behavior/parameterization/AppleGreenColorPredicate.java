package com.event.geru.java8.behavior.parameterization;

import com.event.geru.java8.Apple;

public class AppleGreenColorPredicate implements ApplePredicate {

	@Override
	public boolean test(Apple apple) {
		return "green".equals(apple.getColor());
	}

}
