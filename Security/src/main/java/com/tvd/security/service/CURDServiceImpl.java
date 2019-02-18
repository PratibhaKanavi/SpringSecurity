package com.tvd.security.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tvd.security.dao.CURDDAO;
import com.tvd.security.model.Employee;

@Service
public class CURDServiceImpl implements CURDService{

	@Autowired
	private CURDDAO dao;

	@Override
	public void save(Employee emp) {
		// TODO Auto-generated method stub
		dao.save(emp);
	}

	@Override
	public List<Employee> view() {
		// TODO Auto-generated method stub
		return dao.view();
	}

	@Override
	public Employee edit(int empid) {
		// TODO Auto-generated method stub
		return dao.edit(empid);
	}

	@Override
	public void update(Employee emp) {
		// TODO Auto-generated method stub
		 dao.update(emp);
	}

	@Override
	public void delete(int empid) {
		// TODO Auto-generated method stub
		 dao.delete(empid);
	}
}
