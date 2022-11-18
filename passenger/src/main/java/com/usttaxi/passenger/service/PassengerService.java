package com.usttaxi.passenger.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.usttaxi.passenger.VO.OfferRide;
import com.usttaxi.passenger.VO.ResponseTemplateVO;
import com.usttaxi.passenger.model.Passenger;
import com.usttaxi.passenger.repo.PassengerRepo;
@Service
public class PassengerService {
	
	
	@Autowired
	private PassengerRepo passengerRepo;
	
	 @Autowired
	 private RestTemplate restTemplate;

	 public Passenger saveUser(Passenger passenger) {
	        
	        return passengerRepo.save(passenger);
	    }
	 
	public ResponseTemplateVO getPassengerWithOffer(int uid) {
		
	       ResponseTemplateVO vo = new ResponseTemplateVO();
	       Passenger passenger = passengerRepo.findByUid(uid);



	       OfferRide offerRide =
	                restTemplate.getForObject("http://OFFERRIDE-SERVICE/offerride/offer/" + passenger.getUid()
	                        ,OfferRide.class);



	       vo.setPassenger(passenger);
	       vo.setOfferRide(offerRide);



	       return  vo;

	}

	
	

}
