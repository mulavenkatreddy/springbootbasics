package com.it.passwordencoder.dto;

public class PasswordEncoderDto {

	private String password;

	
	
	@Override
	public String toString() {
		return "PasswordEncoderDto [password=" + password + "]";
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
