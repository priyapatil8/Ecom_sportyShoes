package com.ecommerce.webapp.Exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class ShoeNotFound extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	public ShoeNotFound(String message) {
		
		super(message);
	}

}