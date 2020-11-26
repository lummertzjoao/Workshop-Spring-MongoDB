package com.joaolummertz.workshopspringmongodb.services.exceptions;

public class ObjectNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ObjectNotFoundException() {
		super();
	}
	
	public ObjectNotFoundException(String message) {
		super(message);
	}
}
