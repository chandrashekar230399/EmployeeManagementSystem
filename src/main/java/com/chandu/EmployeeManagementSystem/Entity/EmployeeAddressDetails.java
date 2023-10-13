package com.chandu.EmployeeManagementSystem.Entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_address")
public class EmployeeAddressDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer addressId;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String pincode;
	private String state;
	@Enumerated(EnumType.STRING)
	private AddressType addresstype;
	
	public EmployeeAddressDetails() {
		super();
		
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
	public AddressType getAddresstype() {
		return addresstype;
	}
	public void setAddresstype(AddressType addresstype) {
		this.addresstype = addresstype;
	}
	@Override
	public String toString() {
		return "EmployeeAddressDetails [addressId=" + addressId + ", addressLine1=" + addressLine1 + ", addressLine2="
				+ addressLine2 + ", city=" + city + ", pincode=" + pincode + ", state=" + state + ", addresstype="
				+ addresstype + "]";
	}
	
	
	
	
}
