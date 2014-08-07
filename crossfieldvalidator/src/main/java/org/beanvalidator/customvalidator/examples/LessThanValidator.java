package org.beanvalidator.customvalidator.examples;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.ConstraintViolation;

public class LessThanValidator  implements ConstraintValidator<LessThan, Object>{

	private LessThan constraint;

	@Override
    public void initialize(LessThan constraintAnnotation) {
        constraint = constraintAnnotation;
    }

	@Override
	public boolean isValid(final Object object, ConstraintValidatorContext context) {
		return false;
	}

	
	
}
