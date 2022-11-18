package com.usttaxi.passenger.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.usttaxi.passenger.model.Passenger;
@Repository
public interface PassengerRepo extends JpaRepository<Passenger,Integer> {
	
	Passenger findByUid(int uid);

}
