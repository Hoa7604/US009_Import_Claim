package com.dxc.importclaim.io;

//import java.util.Date;

import java.sql.Date;


public class ImportClaim {
	private String claim_no;
	private String policy_no;
	private Date date_occurred;
	private String policy_owner;
	private String engine_no;
	private String chassis_no;
	private String vehicle_registration_no;
	private String reserve_currency;
	private Double reserve_amount;
	
	
	public ImportClaim() {
		super();
	}
	
	

	public ImportClaim(String claim_no, String policy_no, Date date_occurred, String policy_owner, String engine_no,
			String chassis_no, String vehicle_registration_no, String reserve_currency, Double reserve_amount) {
		super();
		this.claim_no = claim_no;
		this.policy_no = policy_no;
		this.date_occurred = date_occurred;
		this.policy_owner = policy_owner;
		this.engine_no = engine_no;
		this.chassis_no = chassis_no;
		this.vehicle_registration_no = vehicle_registration_no;
		this.reserve_currency = reserve_currency;
		this.reserve_amount = reserve_amount;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public String getClaim_no() {
		return claim_no;
	}
	public void setClaim_no(String claim_no) {
		this.claim_no = claim_no;
	}
	
	public String getPolicy_no() {
		return policy_no;
	}
	public void setPolicy_no(String policy_no) {
		this.policy_no = policy_no;
	}
 
	public Date getDate_occurred() {
		return date_occurred;
	}

	public void setDate_occurred(Date date_occurred) {
		this.date_occurred = date_occurred;
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
	
	public Double getReserve_amount() {
		return reserve_amount;
	}
	public void setReserve_amount(Double reserve_amount) {
		this.reserve_amount = reserve_amount;
	}
	 
}
