package com.aurotech.test.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aurotech.common.model.Employee;
import com.aurotech.jdbc.impl.EmployeeDaoImpl;

public class TestJDBC {

	public static void main(String[] args) {
		System.out.println("hello");
			int [] a = new int[5];
			
		// TODO Auto-generated method stub
		 ApplicationContext context = 
	             new ClassPathXmlApplicationContext("Beans.xml");
		 EmployeeDaoImpl emp = (EmployeeDaoImpl)context.getBean("employeeTemplate");
		List<Employee> emp1 = emp.listEmployees(101);
		 System.out.println(emp1);
		 //
		// F:\PROJECTS\Spring3MVC\src\main\webapp
		 //F:/PROJECTS/Spring3MVC/src/main/webapp/WEB-INF/Beans.xml
	}

}
