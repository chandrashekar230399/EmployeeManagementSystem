package com.chandu.EmployeeManagementSystem.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chandu.EmployeeManagementSystem.Entity.Employee;



@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

	public Employee findByPhoneNumber(String phoneNumber);
	public List<Employee> findByEmpId(Integer empId);
}
