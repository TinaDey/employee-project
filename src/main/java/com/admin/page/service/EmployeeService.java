package com.admin.page.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.page.model.Employee;
import com.admin.page.repo.EmployeeRepoDb;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepoDb repo;

	public List<Employee> getEmployee() {
		return repo.findAll();
	}
	
	public void addEmployee(Employee employee) {
		repo.save(employee);
	}
	
	

}
