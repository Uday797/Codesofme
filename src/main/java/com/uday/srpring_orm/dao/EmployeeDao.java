package com.uday.srpring_orm.dao;
import javax.transaction.Transactional;
import java.util.List;
import org.springframework.orm.hibernate5.HibernateTemplate;


import com.uday.srpring_orm.entities.Employee;
public class EmployeeDao {

	
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public int addEmployee(Employee employee) {
		Integer rows = (Integer)hibernateTemplate.save(employee);
		return rows;
	}
	
	public List<Employee> getallEmployees(){
		List<Employee> employee=hibernateTemplate.loadAll(Employee.class);
		return employee;
		
	}
    public Employee getEmployeebyId(int empId) {
    	Employee employee=hibernateTemplate.get(Employee.class,empId);
		return employee;
    }
    
    @Transactional
    public void UpdateEmployee(Employee employee) {
    	hibernateTemplate.update(employee);
    }
	
    @Transactional
    public void DeleteEmployee(int empId) {
    	Employee employee=hibernateTemplate.get(Employee.class,empId);
    	hibernateTemplate.delete(employee);
    }
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
	
}