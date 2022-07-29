package com.bilgeadam.boost.forname;

public class Cat {

	private String name;
	private int age;

	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Dog [name=" + this.name + ", age=" + this.age + "]";
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

}
