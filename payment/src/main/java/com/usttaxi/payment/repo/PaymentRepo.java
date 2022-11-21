package com.usttaxi.payment.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.usttaxi.payment.model.Payment;

@Repository
public interface PaymentRepo extends JpaRepository<Payment,Integer> {
	Payment findByTripid(int trip_id);
	Payment findByPayid(int pay_id);

}
