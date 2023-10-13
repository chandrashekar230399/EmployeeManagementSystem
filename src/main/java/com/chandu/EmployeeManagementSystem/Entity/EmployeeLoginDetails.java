package com.chandu.EmployeeManagementSystem.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp_login_details")
public class EmployeeLoginDetails {

	@Id
	private String userName;
	private String password;
	
	
	public EmployeeLoginDetails() {
		super();
		
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "EmployeeLoginDetails [userName=" + userName + ", password=" + password + "]";
	}
	
	
	
}
