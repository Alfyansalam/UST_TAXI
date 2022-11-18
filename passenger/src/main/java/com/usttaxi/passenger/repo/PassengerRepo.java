package com.usttaxi.passenger.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usttaxi.passenger.model.Passenger;

public interface PassengerRepo extends JpaRepository<Passenger,Integer> {
	
	Passenger findByUserId(Long userid);

}
