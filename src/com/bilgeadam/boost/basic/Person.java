package com.bilgeadam.boost.basic;

public class Person {
	private static final int NUMBER = 3;
	private String name;
	private String surName;
	private int birthYear;

	public Person(String name, String surName) {
		super();
		this.name = name;
		this.surName = surName;

	}

	public Person(String name, String surName, int birthYear) {
		super();
		this.name = name;
		this.surName = surName;
		this.birthYear = birthYear;
	}

	public int getBirthYear() {
		return this.birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public String getFullName() {
		return this.getName().concat(" ").concat(this.getSurName());

	}

	public String getName() {
		return this.name;
	}

	public String getSurName() {
		return this.surName;
	}
	
}
