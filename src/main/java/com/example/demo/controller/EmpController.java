package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmpService;

@RestController
public class EmpController {
	
	@Autowired
	EmpService eser;
	
	@PostMapping("/addemp")
	public Employee regEmployee(@RequestBody Employee emp)
	{
		
		
		return eser.addEmployee(emp);
	}
	
	@GetMapping("/getemp")
	public List<Employee>getEmp()
	{
		return eser.getEmployee();
		
	}
	
	@DeleteMapping("/deleteemp/{id}")
	public void deleteEmp(@PathVariable Integer id)
	{
		eser.deleteEmployee(id);
		
	}
	
	@PutMapping("/updateemp")
	public Employee updateEmp(@RequestBody Employee emp)
	{
		
		
		return eser.updateEmployee(emp);
	}
	
	
	
	
	
	
	
	
	

}
