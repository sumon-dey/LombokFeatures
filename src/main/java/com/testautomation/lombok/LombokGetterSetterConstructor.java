/*Getters, Setters, Constructors using Lombok*/
package com.testautomation.lombok;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*We can put a @Getter and/or @Setter annotation on a class. In that case, 
 * it's as if we annotate all the non-static fields in that class with the annotation. */
@Getter // this tells Lombok to generate the getters for all the fields of this class
@Setter // this tells Lombok to generate the setters for all the fields of this class
@NoArgsConstructor // this tells Lombok to generate an empty constructor of the class
public class LombokGetterSetterConstructor {

	/*
	 * The generated getter/setter method will be public unless we explicitly
	 * specify an AccessLevel. Legal access levels are PUBLIC, PROTECTED, PACKAGE,
	 * and PRIVATE.
	 */
	private String firstName;
	// setting the access level of the setter for the field "lastName" to protected
	private @Setter(AccessLevel.PROTECTED) String lastName;
	private @Getter(AccessLevel.PACKAGE) int age;
	private boolean marked;
	/*
	 * We can always manually disable getter/setter generation for any field by
	 * using the special AccessLevel.NONE access level. This lets us override the
	 * behavior of a @Getter, @Setter or @Data annotation on a class.
	 */
	private @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) String address;

	public LombokGetterSetterConstructor(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

}
