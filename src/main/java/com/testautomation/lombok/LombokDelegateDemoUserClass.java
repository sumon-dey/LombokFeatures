package com.testautomation.lombok;

import lombok.experimental.Delegate;

public class LombokDelegateDemoUserClass implements LombokDelegateDemoInterface {
	// Whichever other User-specific attributes

	@Delegate(types = { LombokDelegateDemoInterface.class })
	private final LombokDelegateDemoAdapterClass lombokDelegateDemoAdapterClass = new LombokDelegateDemoAdapterClass();

	// User itself will implement all contact information by delegation
}
