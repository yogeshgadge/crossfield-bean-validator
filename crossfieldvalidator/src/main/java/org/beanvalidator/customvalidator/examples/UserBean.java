package org.beanvalidator.customvalidator.examples;

@CrossFieldValidated(beanClass=UserBean.class)

public class UserBean {

	
	private long minimumNumber;
	
	@OtherField(otherProperty="minimumNumber")
	private long maximumNumber;

	public UserBean(long minimumNumber, long maximumNumber) {
		super();
		this.minimumNumber = minimumNumber;
		this.maximumNumber = maximumNumber;
	}

	
}
