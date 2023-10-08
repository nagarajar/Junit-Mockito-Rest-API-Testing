package com.junit.mokito.exceptions;

public class VendorNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public VendorNotFoundException(String errorMessage) {

		super(errorMessage);
	}
}
