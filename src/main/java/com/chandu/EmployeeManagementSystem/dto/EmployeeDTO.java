package com.chandu.EmployeeManagementSystem.dto;

import java.util.List;

import com.chandu.EmployeeManagementSystem.Entity.EmployeeLoginDetails;
import com.chandu.EmployeeManagementSystem.Entity.EmployeeType;

public class EmployeeDTO {

	private Integer empId;
	private String empName;
	private String phoneNumber;
	private EmployeeType type;
	private EmployeeLoginDetails login;
	private List<EmployeeAddressDTO> addressdto;

	public EmployeeDTO()

	{
		super();

	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public EmployeeType getType() {
		return type;
	}

	public void setType(EmployeeType type) {
		this.type = type;
	}

	public EmployeeLoginDetails getLogin() {
		return login;
	}

	public void setLogin(EmployeeLoginDetails login) {
		this.login = login;
	}

	public List<EmployeeAddressDTO> getAddressdto() {
		return addressdto;
	}

	public void setAddressdto(List<EmployeeAddressDTO> addressdto) {
		this.addressdto = addressdto;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [empId=" + empId + ", empName=" + empName + ", phoneNumber=" + phoneNumber + ", type="
				+ type + ", login=" + login + ", addressdto=" + addressdto + "]";
	}

}
