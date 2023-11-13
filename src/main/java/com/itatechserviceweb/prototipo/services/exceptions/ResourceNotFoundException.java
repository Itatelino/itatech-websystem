package com.itatechserviceweb.prototipo.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(Object id) {
		super("Resourse not foound. Id " + id);
	}
}
