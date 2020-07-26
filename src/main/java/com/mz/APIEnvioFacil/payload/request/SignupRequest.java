package com.mz.APIEnvioFacil.payload.request;

import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class SignupRequest {

//    @NotBlank
//    @Size(min = 3, max = 20)
//    private String username;

	@NotBlank
	@Size(max = 100)
	@Email
	private String email;

	private Set<String> role;

	@NotBlank
	@Size(min = 6, max = 120)
	private String password;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<String> getRole() {
		return this.role;
	}

	public void setRole(Set<String> role) {
		this.role = role;
	}
}