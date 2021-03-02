package com.amitu.springcruddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amitu.springcruddemo.entity.Employee;

@Repository
public class EmployeeDaoHibernateImpl implements EmployeeDao {
	
	private EntityManager entityManager;
	
	@Autowired
	public EmployeeDaoHibernateImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
