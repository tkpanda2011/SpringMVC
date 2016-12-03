package com.aurotech.jdbc.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.aurotech.common.model.Employee;

public class EmpRowMappers {

	 class EmpMapper implements RowMapper<Employee> {

		@Override
		public Employee mapRow(ResultSet rs, int rowId) throws SQLException {
			Employee emp = new Employee();

			emp.setEmployeeId(rs.getLong("EMPLOYEE_ID"));
			emp.setCommissionPct(rs.getBigDecimal("COMMISSION_PCT"));
			emp.setFirstName(rs.getString("FIRST_NAME"));
			emp.setLastName(rs.getString("FIRST_NAME"));
			emp.setEmail(rs.getString("FIRST_NAME"));
			emp.setPhoneNumber(rs.getString("PHONE_NUMBER"));
			emp.setHireDate(rs.getDate("HIRE_DATE"));
			emp.setSalary(rs.getBigDecimal("SALARY"));
			String jobId = rs.getString("JOB_ID");
		//	String departmentId = ;
		//	emp.setDepartment(getDepartment(conn, departmentId));
		//	emp.setJob(getJob(conn, jobId));
			String managerId = rs.getString("MANAGER_ID");
		//	emp.setManager(getManager(managerId, conn));
		return emp;
		}
		
	}
}
