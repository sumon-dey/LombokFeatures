package com.testautomation.lombok;

import lombok.EqualsAndHashCode;
import lombok.ToString;

/*No need to start a debugger to see your fields: Just let lombok generate a toString for you.
 * Any class definition may be annotated with @ToString to let lombok generate an implementation 
 * of the toString() method. By default, it'll print your class name, along with each field, 
 * in order, separated by commas. By default, all non-static fields will be printed*/
@ToString
// @ToString(exclude = { "stringVal2" })

/*
 * Any class definition may be annotated with @EqualsAndHashCode to let lombok
 * generate implementations of the equals(Object other) and hashCode() methods.
 * By default, it'll use all non-static, non-transient fields, but you can
 * modify which fields are used (and even specify that the output of various
 * methods is to be used) by marking type members
 * with @EqualsAndHashCode.Include or @EqualsAndHashCode.Exclude. Alternatively,
 * you can specify exactly which fields or methods you wish to be used by
 * marking them with @EqualsAndHashCode.Include and
 * using @EqualsAndHashCode(onlyExplicitlyIncluded = true).
 */
@EqualsAndHashCode(of = { "intVal" })
public class LombokToStringEqualsHashCode {

	private int intVal = 25;
	private String stringVal1 = "Awesome";
	@ToString.Exclude
	private String stringVal2 = "Day";

	public static void main(String[] args) {
		LombokToStringEqualsHashCode obj1 = new LombokToStringEqualsHashCode();
		System.out.println(obj1);
		System.out.println(obj1.hashCode());
	}

}
