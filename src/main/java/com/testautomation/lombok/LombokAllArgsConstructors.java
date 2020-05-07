package com.testautomation.lombok;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

public class LombokAllArgsConstructors {
	/*
	 * @AllArgsConstructor generates a constructor with 1 parameter for each field
	 * in your class. Fields marked with @NonNull result in null checks on those
	 * parameters.
	 */
	public static void main(String[] args) {
		LombokAllArgsConstructorsClass obj = new LombokAllArgsConstructorsClass(23, "Sam", "22B BakerStreet");
		System.out.println("Name: " + obj.getName() + ", Age: " + obj.getAge() + " and Address: " + obj.getAddress());
	}

}

@AllArgsConstructor
@Getter
class LombokAllArgsConstructorsClass {
	private int age;
	private final String name;
	@NonNull
	private String address;
}
