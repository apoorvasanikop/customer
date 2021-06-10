package com.cg.society.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.cg.society.exceptions.UserNotFoundException;


public class ValidationHandling {
	
	@ControllerAdvice
	public class ValidationHandler extends ResponseEntityExceptionHandler {

		@ExceptionHandler(value = UserNotFoundException.class)
		public ResponseEntity<Object> exception(UserNotFoundException exception) {

			return new ResponseEntity<>("User Not Found!!", HttpStatus.NOT_FOUND);

		}
		
		@Override
		protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
				HttpHeaders headers, HttpStatus status, WebRequest request) {

			Map<String, String> errors = new HashMap<>();
			ex.getBindingResult().getAllErrors().forEach(error -> {
				String fieldName = ((FieldError) error).getField();
				String message = error.getDefaultMessage();
				errors.put(fieldName, message);
			});

			return new ResponseEntity<Object>(errors, HttpStatus.BAD_REQUEST);
		}
	
	}
}
		
	


