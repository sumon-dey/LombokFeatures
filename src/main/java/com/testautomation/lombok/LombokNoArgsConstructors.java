package com.testautomation.lombok;

import lombok.Getter;
import lombok.NoArgsConstructor;
/*
 * @NoArgsConstructor will generate a constructor with no parameters. If this is
 * not possible (because of final fields), a compiler error will result instead,
 * unless @NoArgsConstructor(force = true) is used, then all final fields are
 * initialized with 0 / false / null. For fields with constraints, such
 * as @NonNull fields, no check is generated,so be aware that these constraints
 * will generally not be fulfilled until those fields are properly initialized
 * later. This annotation is useful primarily in combination with either @Data
 * or one of the other constructor generating annotations.
 */

public class LombokNoArgsConstructors {

	public static void main(String[] args) {
		LombokNoArgsConstructorsClass obj = new LombokNoArgsConstructorsClass();
		System.out.println("Name: " + obj.getName() + " and Age: " + obj.getAge());
	}

}

// @NoArgsConstructor
@NoArgsConstructor(force = true)
@Getter
class LombokNoArgsConstructorsClass {
	private int age;
	private final String name;

	public LombokNoArgsConstructorsClass(String name) {
		this.name = name;
	}
}
