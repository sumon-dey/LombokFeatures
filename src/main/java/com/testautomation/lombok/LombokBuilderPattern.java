package com.testautomation.lombok;

import lombok.Builder;

/* The @Builder annotation produces complex builder APIs for your classes.

@Builder lets you automatically produce the code required to have your class be instantiable with code such as:
Person.builder().name("Adam Savage").city("San Francisco").job("Mythbusters").job("Unchained Reaction").build();

@Builder can be placed on a class, or on a constructor, or on a method. While the "on a class" and "on a constructor"
 mode are the most common use-case, @Builder is most easily explained with the "method" use-case.

A method annotated with @Builder (from now on called the target) causes the following 7 things to be generated:

    An inner static class named FooBuilder, with the same type arguments as the static method (called the builder).
    In the builder: One private non-static non-final field for each parameter of the target.
    In the builder: A package private no-args empty constructor.
    In the builder: A 'setter'-like method for each parameter of the target: It has the same type as that parameter 
    and the same name. It returns the builder itself, so that the setter calls can be chained, as in the above example.
    In the builder: A build() method which calls the method, passing in each field. It returns the same type that the
     target returns.
    In the builder: A sensible toString() implementation.
    In the class containing the target: A builder() method, which creates a new instance of the builder.
*/
@Builder
class LombokBuilderPatternClass {

	private int employeeID;
	private String employeeFirstName;
	private String employeeLastName;
	private String employeeAddress;

	public void displayEmployeeDetails() {
		System.out.println("Employee Detail is as follows: " + "ID: " + employeeID + ", First Name: "
				+ employeeFirstName + ", Last Name: " + employeeLastName + ", Address: " + employeeAddress);
	}

}

public class LombokBuilderPattern {
	public static void main(String[] args) {
		LombokBuilderPatternClass lombokBuilderPatternClass = LombokBuilderPatternClass.builder().employeeID(22)
				.employeeFirstName("Sam").employeeLastName("Smith").employeeAddress("123B Baker Street").build();
		lombokBuilderPatternClass.displayEmployeeDetails();
	}

}
