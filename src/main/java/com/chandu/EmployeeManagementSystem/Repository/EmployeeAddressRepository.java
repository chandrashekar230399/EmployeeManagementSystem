package com.chandu.EmployeeManagementSystem.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chandu.EmployeeManagementSystem.Entity.EmployeeAddressDetails;
@Repository
public interface EmployeeAddressRepository extends CrudRepository<EmployeeAddressDetails, Integer>{

}
