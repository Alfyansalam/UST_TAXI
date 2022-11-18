package com.usttaxi.passenger.VO;

import com.usttaxi.passenger.model.Passenger;

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
