package com.testautomation.lombok;

public class LombokGetterSetterConstructorTest {

	public static void main(String[] args) {
		LombokGetterSetterConstructor newLombokUser1 = new LombokGetterSetterConstructor();
		newLombokUser1.setFirstName("John");
		newLombokUser1.setLastName("Smith");
		newLombokUser1.setAge(32);
		System.out.println("Name: " + newLombokUser1.getFirstName() + " " + newLombokUser1.getLastName() + ", Age: "
				+ newLombokUser1.getAge());
		System.out.println("*******************************************************");
		LombokGetterSetterConstructor newLombokUser2 = new LombokGetterSetterConstructor("Jack", "Doe", 25);
		System.out.println("Name: " + newLombokUser2.getFirstName() + " " + newLombokUser2.getLastName() + ", Age: "
				+ newLombokUser2.getAge());
		System.out.println("*******************************************************");
	}

}
