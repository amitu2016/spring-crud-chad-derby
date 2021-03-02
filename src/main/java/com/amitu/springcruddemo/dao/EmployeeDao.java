package com.amitu.springcruddemo.dao;

import java.util.List;

import com.amitu.springcruddemo.entity.Employee;

public interface EmployeeDao {
	
	public List<Employee> findAll();
}
