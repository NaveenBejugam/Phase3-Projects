package com.simplilearn.SportyShoes;

import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionHandler {
	
	public String handleException1(Exception e) {
		e.printStackTrace();
		return "Error Occured.";
	}
}
