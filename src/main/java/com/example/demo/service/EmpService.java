package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmpRepository;

//service - crud operations
@Service
public class EmpService {

	
	@Autowired
	public EmpRepository emprepo;
	
	
//	post data  -adding data into the table
	public Employee addEmployee(Employee emp) {
		
		return emprepo.save(emp);
	}
	
//  get -  to retrieve the data from the table
	
	public List<Employee>getEmployee()
	{
		
		return emprepo.findAll();
	}
	
	
//delete - to delete the data from the table
	
	public void deleteEmployee(int id)
	{
		
		emprepo.deleteById(id);
	}
	
//	update - to change the data in the table
	
	public Employee updateEmployee(Employee emp)
	{
		Integer id = emp.getId();
		Employee emp1 = emprepo.findById(id).get();
		emp1.setName(emp1.getName());
		return emprepo.save(emp);
		
		
	}
	
	
	
	
		
}
