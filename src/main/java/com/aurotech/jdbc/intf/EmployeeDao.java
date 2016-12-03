package com.aurotech.jdbc.intf;

import java.util.List;

import javax.sql.DataSource;

import com.aurotech.common.model.Employee;

public interface EmployeeDao {
	/** 
	    * This is the method to be used to initialize
	    * database resources ie. connection.
	    */
	   public void setDataSource(DataSource ds);
	   /** 
	    * This is the method to be used to create
	    * a record in the Employee table.
	    */
	   public void create(String name, Integer age);
	   /** 
	    * This is the method to be used to list down
	    * a record from the Employee table corresponding
	    * to a passed Employee id.
	    */
	   public Employee getEmployee(Integer id);
	   /** 
	    * This is the method to be used to list down
	    * all the records from the Employee table.
	    */
	   public List<Employee> listEmployees( Integer id);
	   /** 
	    * This is the method to be used to delete
	    * a record from the Employee table corresponding
	    * to a passed Employee id.
	    */
	   public void delete(Integer id);
	   /** 
	    * This is the method to be used to update
	    * a record into the Employee table.
	    */
	   public void update(Integer id, Integer age);
}
