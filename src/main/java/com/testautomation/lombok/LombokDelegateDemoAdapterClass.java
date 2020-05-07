package com.testautomation.lombok;

import lombok.Data;

@Data
public class LombokDelegateDemoAdapterClass implements LombokDelegateDemoInterface {

	private String firstName;
	private String lastName;
	private String phoneNr;

	@Override
	public String getFullName() {
		return getFirstName() + " " + getLastName();
	}

}
