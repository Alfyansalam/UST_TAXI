package com.spring.login.security.services;

import java.util.Optional;

import com.spring.login.models.User;



public interface EmailService {
	

	String sendSimpleMail(Optional<User> findById);
}
