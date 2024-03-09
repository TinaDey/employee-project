package com.admin.page.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.admin.page.model.Employee;
import com.admin.page.model.EmployeeId;

@Repository
public interface EmployeeRepoDb extends JpaRepository<Employee, EmployeeId> {

}
