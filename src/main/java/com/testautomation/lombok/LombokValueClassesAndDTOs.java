package com.testautomation.lombok;

import java.net.URL;
import java.time.Duration;
import java.time.Instant;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

@RequiredArgsConstructor // this will get constructor for all the final fields defined in the class
@Accessors(fluent = true) // getters would have the same method name as the fields
@Getter
public class LombokValueClassesAndDTOs {

	/*
	 * We can use @NonNull on the parameter of a method or constructor to have
	 * lombok generate a null-check statement for us.
	 */
	// adding @NonNull to the attributes will make the constructor check for
	// nullablity and throw NullPointerExceptions accordingly. This would also
	// happen if the fields were non-final and we added @Setter for them
	private final @NonNull String str1;
	private final @NonNull String str2;
	private final @NonNull String str3;
	private final @NonNull String str4;

	// In boilerplate code, what is needed is:-
	// constructor taking every field and checking nulls
	// read-only accessor, not necessarily as get*() form

	public static void main(String[] args) {
		LombokValueClassesAndDTOs obj1 = new LombokValueClassesAndDTOs("I", "Love", "Java", "Programming");
		System.out.println(obj1.str1());
		System.out.println(obj1.str2());
		System.out.println(obj1.str3());
		System.out.println(obj1.str4());
		System.out.println("*********************************************************************");
		LombokValueClassesAndDTOs obj2 = new LombokValueClassesAndDTOs("I", "Love", "Java", null);
		System.out.println(obj2.str1());
		System.out.println(obj2.str2());
		System.out.println(obj2.str3());
		System.out.println(obj2.str4());

	}

}
