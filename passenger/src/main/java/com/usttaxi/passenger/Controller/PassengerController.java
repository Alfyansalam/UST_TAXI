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


@RestController
@RequestMapping("/passenger")
public class PassengerController {
	
	
	@Autowired
	private PassengerRepo passengerrepo;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public ResponseTemplateVO getUserWithDepartment(Long userId) {
		return null;
	       //log.info("Inside getUserWithDepartment of UserService");
	        
	    }
	
	@PostMapping("/addPassenger")
	public Passenger bookride(@RequestBody Passenger passenger){
		
		return passengerrepo.save(passenger);
	}
	@GetMapping("/getActiveTrip")     
	public ResponseEntity<List<Passenger>> getAllDrivers() {		
	    return ResponseEntity.ok(vo.findAll());
	}
	

}
