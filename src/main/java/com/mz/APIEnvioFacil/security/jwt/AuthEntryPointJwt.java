package com.mz.APIEnvioFacil.security.jwt;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

@Component
public class AuthEntryPointJwt implements AuthenticationEntryPoint {

	private static final Logger logger = LoggerFactory.getLogger(AuthEntryPointJwt.class);

	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException authException) throws IOException, ServletException {
		logger.error("Unauthorized error: {}", authException.getMessage());

		if (authException.getMessage() == null ) {
			response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "No existe una cuenta registrada para el email.");
		}

		else if (authException.getMessage().equals("Bad credentials")) {

			response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Email o contraseña incorrectos.");
		} else {

			response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Error: No autorizado.");
		}

	}

}