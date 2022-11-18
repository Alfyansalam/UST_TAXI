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
	
	private int tripid;
	private int pay_id;
	private String pay_method;
	private int fee;

	public int getPay_id() {
		return pay_id;
	}
	public void setPay_id(int pay_id) {
		this.pay_id = pay_id;
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
