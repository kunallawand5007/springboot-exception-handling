/**
 * 
 */
package com.kl.centre.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.kl.centre.pojo.UserNotFoundException;

/**
 * @author kunal.lawand
 *
 */
@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(UserNotFoundException.class)
	public final ResponseEntity<String> handleUserNotFoundException(UserNotFoundException ex, WebRequest request) {
		return new ResponseEntity<String>("User Not Found", HttpStatus.NOT_FOUND);
	}

}
