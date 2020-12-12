package com.event.geru.interview.netcraker;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 
 * Input - "1,5,6,7,11,18,19,20,24"; Expected Output - "1,5-7,11,18-20,24";
 * 
 * @author vikram
 *
 */
public class DLSTimeSlot {

	public static void findDLSTimeSlot() {

		String timeslot = "1,5,6,7,11,18,19,20,24";
		// String timeslot = "1,5,6,7,11,13,14,15,18,19,20,24";
		// String timeslot = "1,2,3,5,6,7,11,18,19,20,24";
		ArrayList<Integer> timeList = new ArrayList<Integer>();
		HashMap<Integer, String> resultedTimeSlot = new HashMap<Integer, String>();

		String[] timedev = timeslot.split(",");
		for (int i = 0; i < timedev.length; i++) {
			timeList.add(Integer.parseInt(timedev[i]));
		}

		int i = 0, count = 0;

		while (i < timeList.size()) {

			int startValue = timeList.get(i);
			count = i;

			while (i + 1 < timeList.size()) {
				if (timeList.get(i) + 1 == timeList.get(i + 1)) {
					i++;
					continue;
				}
				break;
			}

			if (count == i) {
				resultedTimeSlot.put(count, "" + startValue);
			} else {
				resultedTimeSlot.put(count, startValue + "-" + timeList.get(i));
			}

			i++;
		}
		System.out.print(resultedTimeSlot);
	}

	public static void main(String args[]) {
		findDLSTimeSlot();
	}

}
