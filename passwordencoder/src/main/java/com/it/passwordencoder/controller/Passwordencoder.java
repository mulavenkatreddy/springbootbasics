package com.it.passwordencoder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Passwordencoder {

	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@PostMapping("/encode")
	public String encodePassword(@RequestParam String password) {
		
		return passwordEncoder.encode(password);
	}
}
