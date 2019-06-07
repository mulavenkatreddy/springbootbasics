package com.it.passwordencoder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.it.passwordencoder.dto.PasswordEncoderDto;
import com.it.passwordencoder.service.PasswordEncoderService;

@RestController
public class PasswordencoderController {

	@Autowired
	PasswordEncoderService pse;
	
	@PostMapping("/encode")
	public String  encodePassword(@RequestBody PasswordEncoderDto passwordEncoderDto) {
		
		return  pse.encodePassword(passwordEncoderDto);
	}
}
