package org.beanvalidator.customvalidator.examples;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

public class UserBeanValidatorTester {

	
	
	public static void main(String[] args) {
		
		
		
		UserBean bean = new UserBean(23, 20);
		
		

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		
		Set<ConstraintViolation<UserBean>> violations =  validator.validate(bean);
		
		System.out.println(violations);
		
	}

	

}
