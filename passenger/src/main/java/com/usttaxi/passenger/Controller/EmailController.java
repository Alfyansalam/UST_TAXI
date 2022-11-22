package com.usttaxi.passenger.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.usttaxi.passenger.repo.PassengerRepo;
import com.usttaxi.passenger.service.EmailService;





@RestController
//Class
public class EmailController {



@Autowired 
private EmailService emailService;
 @Autowired 
 private PassengerRepo passengerRepo;



// Sending a simple Email
 @GetMapping("/sendMail/{tripid}")
 public String SendMail(@PathVariable(value="tripid")int tripid)
 {
	 
 
     String status
         = emailService.sendSimpleMail(passengerRepo.findByTripid(tripid));
    
     



    return status;
 }
}