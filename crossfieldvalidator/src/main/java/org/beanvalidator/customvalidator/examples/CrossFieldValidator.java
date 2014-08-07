package org.beanvalidator.customvalidator.examples;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CrossFieldValidator  implements ConstraintValidator<CrossFieldValidated, Object>{

	
	
	List<CrossFieldDesc> crossFieldMap = new ArrayList<>();
	
	private static class CrossFieldDesc {
		private String field;
		private String otherPropName;
		private Constraint injected;
		public CrossFieldDesc(String field, String otherPropName,
				Constraint injected) {
			super();
			
			this.field = field;
			this.otherPropName = otherPropName;
			this.injected = injected;
		}
		@Override
		public String toString() {
			return "CrossFieldDesc [field=" + field + ", otherPropName="
					+ otherPropName + ", injected=" + injected + "]";
		}
		
		
	}
	
	@Override
	public void initialize(CrossFieldValidated constraintAnnotation) {
		
		Class beanClass = constraintAnnotation.beanClass();
		for(Field field : beanClass.getDeclaredFields()){
			 Class type = field.getType();
			 String fieldName = field.getName();
			 Annotation[] annotations = field.getDeclaredAnnotations();
			 for(Annotation annotation : annotations) {
				 
				 if (annotation.annotationType().equals(OtherField.class)) {
					 System.out.println("found "+annotation);
					 OtherField otherField = (OtherField) annotation;
					 String otherProp = otherField.otherProperty();
					 crossFieldMap.add(new CrossFieldDesc(
							 fieldName, otherProp, 
							 null //we will this one figure out - this could be constraint like LessThan,MustMatch, MustExist
							 ));
					 ;
				 }
			 }
		}

		
	}

	
	
	@Override
	public boolean isValid(Object value, ConstraintValidatorContext context) {
		
		for(CrossFieldDesc crossFields: crossFieldMap) {
			// TODO
		}
		return false;
	}


}
