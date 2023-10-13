package com.chandu.EmployeeManagementSystem.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chandu.EmployeeManagementSystem.Entity.Employee;
import com.chandu.EmployeeManagementSystem.Entity.EmployeeAddressDetails;
import com.chandu.EmployeeManagementSystem.Entity.EmployeeLoginDetails;
import com.chandu.EmployeeManagementSystem.Entity.EmployeeType;
import com.chandu.EmployeeManagementSystem.Repository.EmployeeRepository;
import com.chandu.EmployeeManagementSystem.dto.EmployeeDTO;

@Service(value = "employeeservice")
public class EmployeeServiceImp implements EmployeeService {
	@Autowired
	private EmployeeRepository employeerepository;

	@Override
	public Employee saveEmployeeDetails(Employee e) {
		Integer empid = e.getEmpId();
		String empname = e.getEmpName();
		String phn = e.getPhoneNumber();
		EmployeeType type = e.getType();

		Employee emp = new Employee();
		emp.setEmpId(empid);
		emp.setEmpName(empname);
		emp.setPhoneNumber(phn);
		emp.setType(type);
		String username = e.getEmpName().substring(0, 3) + e.getPhoneNumber().substring(3, 7);

		// employee_Login_details:
		EmployeeLoginDetails newCredentials = new EmployeeLoginDetails();
		newCredentials.setUserName(username);
		newCredentials.setPassword(e.getLogin().getPassword());
		emp.setLogin(newCredentials);
		// employeeloginrepository.save(newCredentials);

		List<EmployeeAddressDetails> list = e.getAddressdetails().stream().map(p -> {
			EmployeeAddressDetails eaddress = new EmployeeAddressDetails();
			eaddress.setAddressId(p.getAddressId());
			eaddress.setAddressLine1(p.getAddressLine1());
			eaddress.setAddressLine2(p.getAddressLine2());
			eaddress.setAddresstype(p.getAddresstype());
			eaddress.setCity(p.getCity());
			eaddress.setPincode(p.getPincode());
			eaddress.setState(p.getState());

			return eaddress;

		}).collect(Collectors.toList());
		emp.setAddressdetails(list);

		employeerepository.save(emp);
		return e;
	}

//	@Override
//	public Employee searchEmployeeByPhoneNumber(String phonenumber) throws EmployeeManagementException {
//		Employee emp = employeerepository.findByPhoneNumber(phonenumber);
//
//		if (emp == null)
//			throw new EmployeeManagementException("No employee details found with gives phonenumber" + phonenumber);
//
//		return null;
//
//	}

}
