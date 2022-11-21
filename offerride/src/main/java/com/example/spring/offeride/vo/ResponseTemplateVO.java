package com.example.spring.offeride.vo;

import com.example.spring.offerride.model.OfferRide;

public class ResponseTemplateVO {

	private Passenger passenger;
	private OfferRide offerRide;
	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	public OfferRide getOfferRide() {
		return offerRide;
	}
	public void setOfferRide(OfferRide offerRide) {
		this.offerRide = offerRide;
	}
	
}
