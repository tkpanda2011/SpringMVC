package com.aurotech.jdbc.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.aurotech.common.model.Employee;
import com.aurotech.jdbc.intf.EmployeeDao;

public class EmployeeDaoImpl implements EmployeeDao {

	private JdbcTemplate jdbcTemplateObject;
	@Override
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);

	}

	@Override
	public void create(String name, Integer age) {
		// TODO Auto-generated method stub

	}

	@Override
	public Employee getEmployee(Integer id) {

		 String SQL = "select * from Employees where EMPLOYEE_ID = ?";
		  List<Employee> employees = jdbcTemplateObject.query(SQL,new EmpRowMappers().new EmpMapper(),id);
	      return employees.iterator().next();
	
	}

	@Override
	public List<Employee> listEmployees(Integer id ) {
		 String SQL = "select * from Employees where manager_ID = ?";
		  List<Employee> employees = jdbcTemplateObject.query(SQL,new EmpRowMappers().new EmpMapper(),id);
	      return employees;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Integer id, Integer age) {
		// TODO Auto-generated method stub

	}

}
