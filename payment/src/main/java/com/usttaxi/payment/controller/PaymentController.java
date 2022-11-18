package com.usttaxi.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usttaxi.payment.VO.ResponseTemplateVO;
import com.usttaxi.payment.service.PaymentService;



@RestController
@RequestMapping("/payment")
public class PaymentController {
	
	@Autowired
	private PaymentService paymentService;
	
	@GetMapping("/{trip_id}")     
    public ResponseTemplateVO getTripDetails(@PathVariable("tripid") int tripid) {
        return paymentService.getTripDetails(tripid);

}
}	
