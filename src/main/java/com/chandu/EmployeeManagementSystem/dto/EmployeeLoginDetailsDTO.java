package com.chandu.EmployeeManagementSystem.dto;

public class EmployeeLoginDetailsDTO {

	private String userName;
	private String password;
	
	public EmployeeLoginDetailsDTO(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
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
		return "EmployeeLoginDetailsDTO [userName=" + userName + ", password=" + password + "]";
	}
	
	
	
}
