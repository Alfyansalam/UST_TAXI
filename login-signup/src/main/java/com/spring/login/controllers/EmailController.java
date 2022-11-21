package com.spring.login.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.login.repository.UserRepository;
import com.spring.login.security.services.EmailService;



@RestController
//Class
public class EmailController {



@Autowired 
private EmailService emailService;
 @Autowired 
 private UserRepository userRepository;



// Sending a simple Email
 @GetMapping("/sendMail/{uid}")
 public String SendMail(@PathVariable(value="uid")Long uid)
 {
	 
 
     String status
         = emailService.sendSimpleMail(userRepository.findById(uid));
    
     



    return status;
 }
}