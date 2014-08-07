package org.beanvalidator.customvalidator.examples;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = OtherFieldValidator.class)
public @interface OtherField {

	/**
	 * The property name that will be reflected to retrieve its value  
	 * @return
	 */
	String otherProperty();
	
	
	String message() default "This is the less than example";
	Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
	
	
	
	
}
