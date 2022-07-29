package com.bilgeadam.boost.forname;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ForNameTest {
	private record RegisteredClass(String packageName, String className) {
	};

	private Map<String, RegisteredClass> myClasses;

	public static void main(String[] args) {
		ForNameTest test = new ForNameTest();
		test.registerClasses();
		test.work();
	}

	private void work() {
		String selection = null;
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter the type of class you want to create (cat, dog, class, human): ");
			selection = input.nextLine();
		}

		if (selection != null && !selection.equals("") && myClasses.containsKey(selection.toLowerCase())) {
			this.workWithClass(selection.toLowerCase());
		}
	}

	private void workWithClass(String selection) {
		RegisteredClass selectedClass = this.myClasses.get(selection);
		String className = selectedClass.packageName + "." + selectedClass.className();
		try {
			Class<?> clazz = Class.forName(className);
			Constructor<?>[] constructors = clazz.getConstructors();
//			for (Constructor<?> constructor : constructors) {
//				System.out.println(constructor.toString());
//			}

			Constructor<?> constructor = constructors[0];
			int params = constructor.getParameterCount();
			Parameter[] parameters = constructor.getParameters();
			
			Object obj = null;
			if(params == 2) {
				obj = constructor.newInstance("Name", 20);
			}
			System.out.println(obj.toString());
			
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void registerClasses() {
		this.myClasses = new HashMap<>();
		this.myClasses.put("class", new RegisteredClass("com.bilgeadam.boost.forname", "ClassRoom"));
		this.myClasses.put("cat", new RegisteredClass("com.bilgeadam.boost.forname", "Cat"));
		this.myClasses.put("dog", new RegisteredClass("com.bilgeadam.boost.forname", "Dog"));
		this.myClasses.put("person", new RegisteredClass("com.bilgeadam.boost.basic", "Person"));

	}

	/*
	 * Instead of record we can use this:
	 *
	 * private class RegisteredClass { private String packageName; private String
	 * ClassName;
	 * 
	 * ........
	 */

}
