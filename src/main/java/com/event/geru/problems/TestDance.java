
package com.event.geru.problems;

public class TestDance {

	public static void main(String args[]) {

		System.out.println(" " + getPositionAt(3));
	}

	private static int getPositionAt(int p) {

		int step = 0, currentStep = 0, previousStep = 0, q = 0;

		for (int i = 0; i < p; i++) {

			if (i == 0)
				q = 0;
			if (q == 1)
				q = 2;
			if (q == 2)
				q = 1;

			switch (q) {
			case 0:
				// move forward
				step = 0;
				System.out.println(" Step 0 " + step + " " + i);
				break;

			case 1:
				// move forward
				currentStep = step;
				currentStep++;
				previousStep = currentStep;
				System.out.println(" Forward, currentStep " + step + " " + previousStep);
				break;

			case 2:
				// move backward
				step = (-(currentStep++) - previousStep);
				System.out.println(" Backward, currentStep " + step + " " + previousStep);
				break;

			}

		}

		return step;
	}
}
