package com.usttaxi.payment.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.usttaxi.payment.VO.OfferRide;
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

	public ResponseTemplateVO getTripDetails(int tripid, int payid) {
		
        ResponseTemplateVO vo = new ResponseTemplateVO();
 Payment payment = paymentRepo.findByPayid(payid);

        Passenger passenger =
                 restTemplate.getForObject("http://PASSENGER-SERVICE/passenger/payment/"+tripid
                         ,Passenger.class);
        OfferRide offerRide =
                restTemplate.getForObject("http://OFFERRIDE-SERVICE/offerride/offer/"+tripid
                        ,OfferRide.class);
        

       payment.setFee(passenger.getFee());
       payment.setTripid(tripid);
       payment.setPay_method("cash");        
       vo.setPayment(payment); 
       vo.setPassenger(passenger);
      
     vo.setOfferRide(offerRide);
paymentRepo.save(payment);
       return  vo;
	}

	


}
