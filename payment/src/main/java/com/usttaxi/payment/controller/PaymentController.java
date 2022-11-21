package com.usttaxi.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usttaxi.payment.VO.ResponseTemplateVO;
import com.usttaxi.payment.model.Payment;
import com.usttaxi.payment.repo.PaymentRepo;
import com.usttaxi.payment.service.PaymentService;

import lombok.extern.slf4j.Slf4j;



@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {
	
	@Autowired
	private PaymentService paymentService;
	@Autowired
	PaymentRepo paymentRepo;
	
	
	 @PostMapping("/details")
	    public Payment addPayment(@RequestBody Payment payment) {
	        return paymentRepo.save(payment);
	    }
	
	@GetMapping("/{tripid}")     
    public ResponseTemplateVO getTripDetails(@PathVariable("tripid") int tripid) {
		
		log.info("Inside saveUser of UserController");


        return paymentService.getTripDetails(tripid);

}
}	
