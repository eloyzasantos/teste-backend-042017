package br.com.exercise2.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="Address Not found.")
public class AddressNotFound extends Exception  {
    
	public AddressNotFound() {}

	public AddressNotFound(String message)
	{
		super(message);
	}
}
