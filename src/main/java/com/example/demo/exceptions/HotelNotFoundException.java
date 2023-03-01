package com.example.demo.exceptions;

public class HotelNotFoundException extends HotelException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public HotelNotFoundException() {
	}
	
	public HotelNotFoundException(String message) {
		super(message);
	}
}