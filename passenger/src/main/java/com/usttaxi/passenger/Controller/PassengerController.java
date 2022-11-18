package com.usttaxi.passenger.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.usttaxi.passenger.VO.OfferRide;
import com.usttaxi.passenger.VO.ResponseTemplateVO;
import com.usttaxi.passenger.model.Passenger;
import com.usttaxi.passenger.repo.PassengerRepo;
import com.usttaxi.passenger.service.PassengerService;


@RestController
@RequestMapping("/passenger")
public class PassengerController {
	
	


	@Autowired
	private PassengerService passengerService;
	
	
	
	

	
	@PostMapping("/addPassenger")
    public Passenger saveUser(@RequestBody Passenger passenger) {
       
        return passengerService.saveUser(passenger);
    }
	@GetMapping("/getActiveTrip/{uid}")     
	public ResponseTemplateVO getPassengerWithOffer(@PathVariable("uid") int uid) {
		return passengerService.getPassengerWithOffer(uid);
	}
	

}
