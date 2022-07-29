package com.bilgeadam.boost.basic;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionTest {

	public static void main(String[] args) {
		Method[] methods = Person.class.getDeclaredMethods();
		Constructor[] constructors = Person.class.getDeclaredConstructors();
		Field[] fields = Person.class.getDeclaredFields();
		
		for (Method method : methods) {
			System.out.println(Person.class.getSimpleName()+" Class method "+method.getName());
		}
		for (Method method : Person.class.getMethods()) {
			System.out.println(Person.class.getSimpleName()+" Class method "+method.getName());
		}
		for (Constructor constructor : constructors ) {
			System.out.println(Person.class.getSimpleName()+" Class constructor "+constructor.getModifiers()+constructor.toString());
		}
		for (Field field : fields ) {
			System.out.println(Modifier.toString(field.getModifiers())+" "+field.getName()+" "+field.toGenericString());
		}
	}

}
