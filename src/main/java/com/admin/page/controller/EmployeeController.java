package com.admin.page.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.admin.page.model.Employee;
import com.admin.page.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;

	@RequestMapping({"/", "/home"})
	public String home() {
		return "home";
	}
	
	@GetMapping("/addEmployee")
	public String addEmployee() {
		return "addEmployee";
	} 
	
	@GetMapping("/getEmployee")
	@ResponseBody
	public List<Employee> getEmployee() {
		return service.getEmployee();
	}
	
	@PostMapping("/handleForm")
	public String handleForm() {
		return "success";
	}
	
	
	
}
