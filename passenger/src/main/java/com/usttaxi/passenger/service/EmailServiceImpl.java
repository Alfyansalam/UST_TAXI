package com.usttaxi.passenger.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.usttaxi.passenger.model.Passenger;



@Service
public class EmailServiceImpl implements EmailService  {



	   @Autowired 
	   private JavaMailSender javaMailSender;



	   @Value("${spring.mail.username}") private String sender;



	   // Method 1
	    // To send a simple email
	   //@Override
	    public String sendSimpleMail(Passenger findById)
	    {



	       // Try block to check for exceptions
	        try {



	           // Creating a simple mail message
	            SimpleMailMessage mailMessage
	                = new SimpleMailMessage();



	           // Setting up necessary details
	            mailMessage.setFrom(sender);
	            mailMessage.setTo(findById.getD_name());
	            mailMessage.setText("Hi "+findById.getD_name()+","+findById.getP_name()+" have booked your ride."+findById.getSource());
	            mailMessage.setSubject("Passenger location");



	           // Sending the mail
	            javaMailSender.send(mailMessage);
	            return "Mail Sent Successfully...";
	        }
	        catch (Exception e) {
	            return "Error while Sending Mail";
	        }
	    }







}