package com.testautomation.lombok;

import lombok.Data;
import lombok.Value;

/*@Data is a convenient shortcut annotation that bundles the features of @ToString, 
 * @EqualsAndHashCode, @Getter / @Setter and @RequiredArgsConstructor 
 * together: In other words, @Data generates all the boilerplate that is normally 
 * associated with simple POJOs (Plain Old Java Objects) and beans: getters for all fields, 
 * setters for all non-final fields, and appropriate toString, equals and hashCode 
 * implementations that involve the fields of the class, and a constructor 
 * that initializes all final fields, as well as all non-final fields with no initializer that 
 * have been marked with @NonNull, in order to ensure the field is never null. */
@Data
public class LombokDataAndValue {
	private int intVal;
	private String stringVal;
	private double doubleVal;
	private float floatVal;
}

/*
 * @Value is the immutable variant of @Data; all fields are made private and
 * final by default, and setters are not generated. The class itself is also
 * made final by default, because immutability is not something that can be
 * forced onto a subclass. Like @Data, useful toString(), equals() and
 * hashCode() methods are also generated, each field gets a getter method, and a
 * constructor that covers every argument (except final fields that are
 * initialized in the field declaration) is also generated.
 * 
 * In practice, @Value is shorthand for:
 * final @ToString @EqualsAndHashCode @AllArgsConstructor @FieldDefaults(
 * makeFinal = true, level = AccessLevel.PRIVATE) @Getter, except that
 * explicitly including an implementation of any of the relevant methods simply
 * means that part won't be generated and no warning will be emitted.
 */
@Value
class LombokDataAndValue2 {
	private int intVal;
	private String stringVal;
	private double doubleVal;
	private float floatVal;
}
