package com.event.geru.hackerank;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class JavaDequeue {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Deque<Integer> deque = new ArrayDeque<>();
		int n = in.nextInt();
		int m = in.nextInt();
		Set<Integer> value = new HashSet<Integer>();
		long count = 0;

		for (int i = 0; i < n; i++) {

			int num = in.nextInt();

			System.out.println(num);
			deque.addLast(num);
			value.add(num);

			// queue is of size 3

			if (deque.size() == m) {

				System.out.println(deque);
				System.out.println(value);
				System.out.println(count);
				System.out.println(value.size());

				if (count < value.size()) {
					count = value.size();

					// System.out.println(value);
					if (!deque.contains(deque.getFirst()))
						value.remove(deque.getFirst());

				}

				// System.out.println("removed"+ deque.getFirst());
				// value.remove(deque.getFirst());
				deque.removeFirst();

			}

		}
		in.close();

		System.out.println(count);
	}

}
