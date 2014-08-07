package org.beanvalidator.customvalidator.examples;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({TYPE, ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = CrossFieldValidator.class)
public @interface CrossFieldValidated {

	Class beanClass();
	
	String message() default "This is the less than example";
	Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
	
	
}
