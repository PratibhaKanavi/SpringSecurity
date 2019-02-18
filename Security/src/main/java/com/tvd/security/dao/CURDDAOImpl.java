package com.tvd.security.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.tvd.security.model.Employee;

@Component
public class CURDDAOImpl implements CURDDAO{

	@Autowired
	private SessionFactory sf;
	
	@Override
	public void save(Employee emp) {
		// TODO Auto-generated method stub
		Session ses = sf.openSession();
		ses.beginTransaction();
		ses.save(emp);
		ses.getTransaction().commit();
		ses.close();
	}
	@Transactional
	@Override
	public List<Employee> view() {
		// TODO Auto-generated method stub
		return (List<Employee>) sf.getCurrentSession().createQuery("from Employee").list();
	}
	
	@Override
	public Employee edit(int empid) {
		// TODO Auto-generated method stub
		
		Session ses = sf.openSession();
		Employee emp = ses.load(Employee.class, new Integer(empid));
		return emp;
	}
	@Transactional
	@Override
	public void update(Employee emp) {
		// TODO Auto-generated method stub
		Session session = this.sf.getCurrentSession();
		session.update(emp);
	}
	@Transactional
	@Override
	public void delete(int empid) {
		// TODO Auto-generated method stub
		
	//	String sql ="DELETE FROM Employee WHERE empid = " + empid+""; 
	//	Session ses = (Session) sf.openSession().createSQLQuery(sql);
		Employee employee = (Employee) sf.getCurrentSession().load(
                Employee.class, empid);
		 if (null != employee) {
	            this.sf.getCurrentSession().delete(employee);
	        }
		
	}

	
	
}
