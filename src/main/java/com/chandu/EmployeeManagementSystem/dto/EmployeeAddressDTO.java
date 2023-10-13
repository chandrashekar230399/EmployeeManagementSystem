package com.chandu.EmployeeManagementSystem.dto;

import com.chandu.EmployeeManagementSystem.Entity.EmployeeAddressDetails;

public class EmployeeAddressDTO {

	private Integer addressId;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String pincode;
	private String state;
	private EmployeeAddressDetails  addresstype;
	
	public EmployeeAddressDTO(Integer addressId, String addressLine1, String addressLine2, String city, String pincode,
			String state, EmployeeAddressDetails addresstype) {
		super();
		this.addressId = addressId;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.pincode = pincode;
		this.state = state;
		this.addresstype = addresstype;
	}
	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public EmployeeAddressDetails getAddresstype() {
		return addresstype;
	}
	public void setAddresstype(EmployeeAddressDetails addresstype) {
		this.addresstype = addresstype;
	}
	@Override
	public String toString() {
		return "EmployeeAddressDTO [addressId=" + addressId + ", addressLine1=" + addressLine1 + ", addressLine2="
				+ addressLine2 + ", city=" + city + ", pincode=" + pincode + ", state=" + state + ", addresstype="
				+ addresstype + "]";
	}
	
	
}
