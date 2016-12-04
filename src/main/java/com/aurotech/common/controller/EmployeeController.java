package com.aurotech.common.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aurotech.common.model.Employee;
import com.aurotech.common.model.Shop;
import com.aurotech.jdbc.impl.EmployeeDaoImpl;
import com.aurotech.jdbc.intf.EmployeeDao;
import com.aurotech.tools.SpringBeanContext;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	/**
	 * @author  TRIPATIKUMAR
	 * @param  id
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "/byId/{id}", method = RequestMethod.GET)
	public @ResponseBody
	Employee getEmpInJSON(@PathVariable String id , HttpServletRequest req) {
		System.out.println("Depart ment IDsddfdfdfsd");
		ApplicationContext context =SpringBeanContext.getInstance().getContext();
		 EmployeeDao emp = (EmployeeDaoImpl)context.getBean("employeeTemplate");
		 Employee emp2 = emp.getEmployee(Integer.valueOf(id));
		 System.out.println(emp2);
		return emp2;

	}
	
	/**
	 * @author TRIPATIKUMAR
	 * @param id
	 * @param req
	 * @return
	 * 
	 * This method is intented to get all the Employees working under the manger ID 
	 */
	@RequestMapping( value = "/allEmp/{manaerID}", method = RequestMethod.GET)
	public @ResponseBody
	List<Employee> getAllEmpInJSON(@PathVariable String manaerID , HttpServletRequest req) {
		System.out.println("Depart ment IDsddfdfdfsd");
		ApplicationContext context =SpringBeanContext.getInstance().getContext();
		 EmployeeDao emp = (EmployeeDaoImpl)context.getBean("employeeTemplate");
		 List<Employee> emp2 = emp.listEmployees(Integer.valueOf(manaerID));
		 System.out.println(emp2);
		return emp2;

	}
	/**
	 * @author TRIPATIKUMAR
	 * @param deptId
	 * @return
	 */
	@RequestMapping(value = "/deptId/{deptId}", method = RequestMethod.GET)
	public @ResponseBody
	List<Employee>  getAllEmpInDeptJSON(@PathVariable String deptId) {
		return null;
	}

}