package com.event.geru.hackerank;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

class Atudent {

	String name;
	String age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

}

public class JavaReflection {

	public static void main(String[] args) {
		Class student = Atudent.class;
		Method[] methods = student.getDeclaredMethods();

		// methods[0].

		ArrayList<String> methodList = new ArrayList<>();
		for (int i = 0; i < methods.length; i++) {
			methodList.add(methods[i].getName());
		}
		Collections.sort(methodList);
		for (String name : methodList) {
			System.out.println(name);
		}
	}

}
