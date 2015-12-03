package com.mycms.legacy.client.service.exception;

public class UserAlreadyExistsException extends RuntimeException {

	public UserAlreadyExistsException(final String message) {
		super(message);
	}

}
