package com.bilgeadam.boost.forname;

public class ClassRoom {

	private String name;
	private int numOfStudents;
	private boolean weekendClass;

	public ClassRoom(String name, int numOfStudents) {
		super();
		this.name = name;
		this.numOfStudents = numOfStudents;
	}

	public ClassRoom(String name, int numOfStudents, boolean weekendClass) {
		this(name, numOfStudents);
		this.weekendClass = weekendClass;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumOfStudents() {
		return this.numOfStudents;
	}

	public void setNumOfStudents(int numOfStudents) {
		this.numOfStudents = numOfStudents;
	}

	public boolean isWeekendClass() {
		return this.weekendClass;
	}

	public void setWeekendClass(boolean weekendClass) {
		this.weekendClass = weekendClass;
	}

	@Override
	public String toString() {
		return "ClassRoom [name=" + this.name + ", numOfStudents=" + this.numOfStudents + ", weekendClass="
				+ this.weekendClass + "]";
	}

}
