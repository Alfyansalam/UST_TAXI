package com.spring.login.security.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.spring.login.models.User;


@Service
public class EmailServiceImpl implements EmailService  {



	   @Autowired 
	   private JavaMailSender javaMailSender;



	   @Value("${spring.mail.username}") private String sender;



	   // Method 1
	    // To send a simple email
	   //@Override
	    public String sendSimpleMail(Optional<User> findById)
	    {



	       // Try block to check for exceptions
	        try {



	           // Creating a simple mail message
	            SimpleMailMessage mailMessage
	                = new SimpleMailMessage();



	           // Setting up necessary details
	            mailMessage.setFrom(sender);
	            mailMessage.setTo(findById.get().getEmail());
	            mailMessage.setText("http://localhost:8080/swagger-ui/index.html#/auth-controller/updateUser");
	            mailMessage.setSubject("password");



	           // Sending the mail
	            javaMailSender.send(mailMessage);
	            return "Mail Sent Successfully...";
	        }
	        catch (Exception e) {
	            return "Error while Sending Mail";
	        }
	    }



}