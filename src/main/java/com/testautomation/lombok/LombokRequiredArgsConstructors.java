package com.testautomation.lombok;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

public class LombokRequiredArgsConstructors {
	/*
	 * @RequiredArgsConstructor generates a constructor with 1 parameter for each
	 * field that requires special handling. All non-initialized final fields get a
	 * parameter, as well as any fields that are marked as @NonNull that aren't
	 * initialized where they are declared. For those fields marked with @NonNull,
	 * an explicit null check is also generated. The constructor will throw a
	 * NullPointerException if any of the parameters intended for the fields marked
	 * with @NonNull contain null. The order of the parameters match the order in
	 * which the fields appear in your class.
	 */
	public static void main(String[] args) {
		LombokRequiredArgsConstructorClass obj = new LombokRequiredArgsConstructorClass(23, "Sam");
		System.out.println("Name: " + obj.getName() + " and Age: " + obj.getAge());
	}
}

@RequiredArgsConstructor
@Getter
class LombokRequiredArgsConstructorClass {
	private final int age;
	private final String name;
}
