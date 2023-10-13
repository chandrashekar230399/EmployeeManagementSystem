package com.chandu.EmployeeManagementSystem.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chandu.EmployeeManagementSystem.Entity.EmployeeLoginDetails;
@Repository
public interface EmployeeLoginRepository extends CrudRepository<EmployeeLoginDetails, String>{

}
