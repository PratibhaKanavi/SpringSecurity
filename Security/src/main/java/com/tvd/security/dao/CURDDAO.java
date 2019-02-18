package com.tvd.security.dao;

import java.util.List;

import com.tvd.security.model.Employee;

public interface CURDDAO {

	void save(Employee emp);

	List<Employee> view();

	Employee edit(int empid);

	void update(Employee emp);

	void delete(int empid);

}
