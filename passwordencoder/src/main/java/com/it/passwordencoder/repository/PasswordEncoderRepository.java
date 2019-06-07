package com.it.passwordencoder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.it.passwordencoder.model.PasswordEncoderModel;;

@Repository
public interface PasswordEncoderRepository  extends JpaRepository<PasswordEncoderModel, Long>{

}
