package org.beanvalidator.customvalidator.examples;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class OtherFieldValidator  implements ConstraintValidator<OtherField, Object>{

	@Override
	public void initialize(OtherField constraintAnnotation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isValid(Object value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		return false;
	}

}
