package com.usttaxi.passenger.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Passenger_Table")
public class Passenger {
	
	
	
	@Id
	@GeneratedValue
	private int p_uid;
	private String trip_id;
	private int uid;
	
	
	private String d_name;
	private String p_name;
	
	private String d_no;
	private String p_no;
	
	private String source;
	private String dest;
	
	private int kms;
	private int fee;
	
	private float priceperkm;
	public float getPriceperkm() {
		return priceperkm;
	}
	public void setPriceperkm(float priceperkm) {
		this.priceperkm = priceperkm;
	}
	public String getTrip_id() {
		return trip_id;
	}
	public void setTrip_id(String trip_id) {
		this.trip_id = trip_id;
	}

	
	public int getP_uid() {
		return p_uid;
	}
	public void setP_uid(int p_uid) {
		this.p_uid = p_uid;
	}
	public String getD_name() {
		return d_name;
	}
	public void setD_name(String d_name) {
		this.d_name = d_name;
	}
	public String getD_no() {
		return d_no;
	}
	public void setD_no(String d_no) {
		this.d_no = d_no;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getP_no() {
		return p_no;
	}
	public void setP_no(String p_no) {
		this.p_no = p_no;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	public int getKms() {
		return kms;
	}
	public void setKms(int kms) {
		this.kms = kms;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	
	
	

}
