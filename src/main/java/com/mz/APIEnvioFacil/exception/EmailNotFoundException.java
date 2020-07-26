package com.mz.APIEnvioFacil.exception;

public class EmailNotFoundException extends Exception {

	public EmailNotFoundException(String errorMessage) {
		super(errorMessage);
	}

	public EmailNotFoundException() {
		super("No se encontro usuario para el email brindado.");
	}
}
