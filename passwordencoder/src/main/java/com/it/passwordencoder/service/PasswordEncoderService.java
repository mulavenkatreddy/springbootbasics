package com.it.passwordencoder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.it.passwordencoder.dto.PasswordEncoderDto;
import com.it.passwordencoder.model.PasswordEncoderModel;
import com.it.passwordencoder.repository.PasswordEncoderRepository;


@Service
public class PasswordEncoderService {

	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	PasswordEncoderRepository passwordRepo;
	
	public String encodePassword(PasswordEncoderDto passwordEncoderDto) {
	
	PasswordEncoderModel password = new PasswordEncoderModel();
	
	password.setPassword(passwordEncoderDto.getPassword());
	password.setEncodedPassword(passwordEncoder.encode(passwordEncoderDto.getPassword()));
	passwordRepo.save(password);
	return "encoded and saved sucessfully";
	}
}
