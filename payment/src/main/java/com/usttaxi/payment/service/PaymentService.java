package com.usttaxi.payment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.usttaxi.payment.VO.Passenger;
import com.usttaxi.payment.VO.ResponseTemplateVO;
import com.usttaxi.payment.model.Payment;
import com.usttaxi.payment.repo.PaymentRepo;

@Service
public class PaymentService {
	
	@Autowired
	private PaymentRepo paymentRepo;
	
	@Autowired
	private RestTemplate restTemplate;

	public ResponseTemplateVO getTripDetails(int tripid) {
		// TODO Auto-generated method stub
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Payment payment = paymentRepo.findByTripid(tripid);

        Passenger passenger =
                 restTemplate.getForObject("http://PASSENGER-SERVICE/passenger/getActiveTrip/" + payment.getTripid()
                         ,Passenger.class);

       vo.setPayment(payment); 
       vo.setPassenger(passenger);
     

       return  vo;
	}


}
