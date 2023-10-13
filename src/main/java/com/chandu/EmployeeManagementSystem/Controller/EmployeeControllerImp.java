package com.chandu.EmployeeManagementSystem.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.chandu.EmployeeManagementSystem.Entity.AddressType;
import com.chandu.EmployeeManagementSystem.Entity.Employee;
import com.chandu.EmployeeManagementSystem.Entity.EmployeeAddressDetails;
import com.chandu.EmployeeManagementSystem.Entity.EmployeeLoginDetails;
import com.chandu.EmployeeManagementSystem.Entity.EmployeeType;
import com.chandu.EmployeeManagementSystem.Service.EmployeeService;

@Controller(value = "employeecontroller")
public class EmployeeControllerImp implements EmployeeController{
	
	@Autowired
	private EmployeeService employeeservice;

	@Override
	public void displayDetails() {
		Employee empinfo = new Employee();
		empinfo.setEmpId(null);
		empinfo.setEmpName("laxmi");
		empinfo.setPhoneNumber("9701544129");
		empinfo.setType(EmployeeType.IT);
		
		EmployeeLoginDetails login = new EmployeeLoginDetails();
		login.setPassword("44444");
		empinfo.setLogin(login);
		//empinfo.setEmpId(1);
		
		//employee_address:
		List<EmployeeAddressDetails> list = new ArrayList<EmployeeAddressDetails>();
		EmployeeAddressDetails edata = new EmployeeAddressDetails();
		edata.setAddressLine1("Lingampally");
		edata.setAddressLine2("chandanagar");
		edata.setCity("Hyderabad");
		edata.setPincode("500019");
		edata.setState("Telengana state");
		edata.setAddressId(null);
		edata.setAddresstype(AddressType.PERMANENT);
		list.add(edata);
		
		empinfo.setAddressdetails(list);
		
		Employee e = employeeservice.saveEmployeeDetails(empinfo);
		System.out.println(e);
	}

}
