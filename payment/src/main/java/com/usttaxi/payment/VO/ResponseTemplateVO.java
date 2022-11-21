package com.usttaxi.payment.VO;

import com.usttaxi.payment.model.Payment;

public class ResponseTemplateVO {

	private Payment payment;
	private Passenger passenger;
	private OfferRide offerRide;
	public OfferRide getOfferRide() {
		return offerRide;
	}
	public void setOfferRide(OfferRide offerRide) {
		this.offerRide = offerRide;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	
}
