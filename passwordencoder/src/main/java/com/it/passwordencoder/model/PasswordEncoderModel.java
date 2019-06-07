package com.it.passwordencoder.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "data")
public class PasswordEncoderModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String password;
	private String encodedPassword;
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEncodedPassword() {
		return encodedPassword;
	}


	public void setEncodedPassword(String encodedPassword) {
		this.encodedPassword = encodedPassword;
	}


	@Override
	public String toString() {
		return "PasswordEncoder [password=" + password + ", encodedPassword=" + encodedPassword + "]";
	}
	
	

}
