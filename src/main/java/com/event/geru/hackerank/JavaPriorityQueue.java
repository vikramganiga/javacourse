package com.event.geru.hackerank;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class Student {
	private int id;
	private String name;
	private double cgpa;

	Student(int id, String name, double cgpa) {
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}

	int getID() {
		return id;
	}

	String getName() {
		return name;
	}

	double getCGPA() {
		return cgpa;
	}

}

class StudentCompare implements Comparator<Student> {

	@Override
	public int compare(Student student, Student t1) {

		if (t1.getCGPA() > student.getCGPA()) {
			return 1;
		} else if (t1.getCGPA() == student.getCGPA()) {
			int cmp = student.getName().compareTo(t1.getName());

			if (cmp == 0) {
				cmp = t1.getID() - student.getID();

				return cmp;
			} else
				return cmp;
		} else {
			return -1;
		}

	}

}

class Priorities {

	PriorityQueue<Student> priorityQueue = new PriorityQueue<>(10, new StudentCompare());
	String cmd, data;

	List<Student> getStudents(List<String> events) {
		for (String entry : events) {

			// System.out.println(entry);

			cmd = entry.split(" ")[0];

			if (cmd.contentEquals("ENTER")) {
				data = entry.substring(5, entry.length());
				data = data.trim();
				// System.out.println(data);
				// System.out.println("Name " + data.split(" ")[0].trim());
				// System.out.println("ID " + data.split(" ")[2].trim());
				// System.out.println("CGPA " + data.split(" ")[1].trim());

				priorityQueue.add(new Student(Integer.parseInt(data.split(" ")[2].trim()), data.split(" ")[0].trim(),
						Double.parseDouble(data.split(" ")[1].trim())));
				// System.out.println("ENTER " +priorityQueue.peek().getName());
			}

			if (cmd.contentEquals("SERVED")) {
				priorityQueue.poll();
				// System.out.println("SERVED " +priorityQueue.remove().getName());
			}

		}

		List<Student> student_list = new ArrayList<Student>();

		while (!priorityQueue.isEmpty()) {
			student_list.add(priorityQueue.poll());
		}

		// List<Student> array_list = new ArrayList<Student>(priorityQueue);;
		return student_list;
	}
}

public class JavaPriorityQueue {

	private final static Scanner scan = new Scanner(System.in);
	private final static Priorities priorities = new Priorities();

	public static void main(String[] args) {
		int totalEvents = Integer.parseInt(scan.nextLine());
		List<String> events = new ArrayList<>();

		while (totalEvents-- != 0) {
			String event = scan.nextLine();
			events.add(event);
		}

		List<Student> students = priorities.getStudents(events);

		if (students.isEmpty()) {
			System.out.println("EMPTY");
		} else {
			for (Student st : students) {
				System.out.println(st.getName());
			}
		}
	}
}