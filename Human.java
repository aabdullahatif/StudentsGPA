package com.mycompany.csc325_oop_designreview_lab;

/**
 * Abstract class representing a human with basic properties like name, age, and address.
 * Subclasses must implement methods for handling the address.
 *
 * Author: Moaath Alrajab
 */
public abstract class Human {
	private String name;
	private String address;
	private short age;

	// Contructor is being created that ask for the name and the age
	public Human(String name, short age) {
		this.name = name;
		this.age = age;
	}

	// Getter is being created that ask the user for the name
	public String getName() {
		return name;
	}

	// Setter is being created that gives the assigned name
	public void setName(String name) {
		this.name = name;
	}

	// Abstract method to implenet the address
	public abstract String getAddress();

	// Abstract method that is used to set the address
	public abstract void setAddress(String address);

	// Getter which gives the user the age
	public short getAge() {
		return age;
	}

	// Setter that sets the age to the required person name
	public void setAge(short age) {
		this.age = age;
	}

	// We use the protected method for the address
	protected void updateAddress(String address) {
		this.address = address;
	}
}
