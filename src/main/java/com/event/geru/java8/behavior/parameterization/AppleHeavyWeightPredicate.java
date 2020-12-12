package com.event.geru.java8.behavior.parameterization;

import com.event.geru.java8.Apple;

public class AppleHeavyWeightPredicate implements ApplePredicate {

	@Override
	public boolean test(Apple apple) {

		return apple.getWeight() > 150;
	}

}
