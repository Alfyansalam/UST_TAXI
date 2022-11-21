package com.usttaxi.payment.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="payment_table")

public class Payment {
	
	@Id
	@GeneratedValue
	private int payid;
	private int tripid;
	
	
	private String pay_method;
	private int fee;

	public int getPayid() {
		return payid;
	}
	public void setPay_id(int payid) {
		this.payid = payid;
	}
	public String getPay_method() {
		return pay_method;
	}
	public void setPay_method(String pay_method) {
		this.pay_method = pay_method;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public int getTripid() {
		return tripid;
	}
	public void setTripid(int tripid) {
		this.tripid = tripid;
	}


	

}
