package com.dxc.importclaim.io;

import java.sql.Date;

public class MotorPolicy {
	private String policy_no;
	private Date inception_date;
	private Date expire_date;
	private String policy_owner;
	private String engine_no;
	private String chassis_no;
	private String vehicle_registration_no;
	private String reserve_currency;
	private String bill_currency;
	private Double sum_insured;
	private int rate;
	private int annual_remium;
	private int posted_premium;
	
	public MotorPolicy(String policy_no, Date inception_date, Date expire_date, String policy_owner, String engine_no,
			String chassis_no, String vehicle_registration_no, String reserve_currency, String bill_currency,
			Double sum_insured, int rate, int annual_remium, int posted_premium) {
		super();
		this.policy_no = policy_no;
		this.inception_date = inception_date;
		this.expire_date = expire_date;
		this.policy_owner = policy_owner;
		this.engine_no = engine_no;
		this.chassis_no = chassis_no;
		this.vehicle_registration_no = vehicle_registration_no;
		this.reserve_currency = reserve_currency;
		this.bill_currency = bill_currency;
		this.sum_insured = sum_insured;
		this.rate = rate;
		this.annual_remium = annual_remium;
		this.posted_premium = posted_premium;
	}
	
	public MotorPolicy() {
		super();
	}
	public String getPolicy_no() {
		return policy_no;
	}
	public void setPolicy_no(String policy_no) {
		this.policy_no = policy_no;
	}
	public Date getInception_date() {
		return inception_date;
	}
	public void setInception_date(Date inception_date) {
		this.inception_date = inception_date;
	}
	public Date getExpire_date() {
		return expire_date;
	}
	public void setExpire_date(Date expire_date) {
		this.expire_date = expire_date;
	}
	public String getPolicy_owner() {
		return policy_owner;
	}
	public void setPolicy_owner(String policy_owner) {
		this.policy_owner = policy_owner;
	}
	public String getEngine_no() {
		return engine_no;
	}
	public void setEngine_no(String engine_no) {
		this.engine_no = engine_no;
	}
	public String getChassis_no() {
		return chassis_no;
	}
	public void setChassis_no(String chassis_no) {
		this.chassis_no = chassis_no;
	}
	public String getVehicle_registration_no() {
		return vehicle_registration_no;
	}
	public void setVehicle_registration_no(String vehicle_registration_no) {
		this.vehicle_registration_no = vehicle_registration_no;
	}
	public String getReserve_currency() {
		return reserve_currency;
	}
	public void setReserve_currency(String reserve_currency) {
		this.reserve_currency = reserve_currency;
	}
	public String getBill_currency() {
		return bill_currency;
	}
	public void setBill_currency(String bill_currency) {
		this.bill_currency = bill_currency;
	}
	public Double getSum_insured() {
		return sum_insured;
	}
	public void setSum_insured(Double sum_insured) {
		this.sum_insured = sum_insured;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public int getAnnual_remium() {
		return annual_remium;
	}
	public void setAnnual_remium(int annual_remium) {
		this.annual_remium = annual_remium;
	}
	public int getPosted_premium() {
		return posted_premium;
	}
	public void setPosted_premium(int posted_premium) {
		this.posted_premium = posted_premium;
	}
	
	
}
