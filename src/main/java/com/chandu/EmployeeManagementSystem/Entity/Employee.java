package com.chandu.EmployeeManagementSystem.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="emp_id",nullable = false)
	private Integer empId;
	@Column(name="emp_name",nullable = false)
	private String empName;
	@Column(name="phonenumber",nullable = false,unique=true)
	private String phoneNumber;
	@Enumerated(EnumType.STRING)
	private EmployeeType type;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="username")
	private EmployeeLoginDetails login;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="emp_id")
	private List<EmployeeAddressDetails> addressdetails;
	
	public Employee() {
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
	
	public List<EmployeeAddressDetails> getAddressdetails() {
		return addressdetails;
	}
	public void setAddressdetails(List<EmployeeAddressDetails> addressdetails) {
		this.addressdetails = addressdetails;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", phoneNumber=" + phoneNumber + ", type=" + type
				+ ", login=" + login + ", addressdetails=" + addressdetails + "]";
	}
	
	
}
