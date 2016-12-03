package com.aurotech.common.model;

import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the JOB_HISTORY database table.
 * 
 */

public class JobHistory implements Serializable {
	private static final long serialVersionUID = 1L;


	private JobHistoryPK id;


	private Date endDate;

	//bi-directional many-to-one association to Department

	private Department department;

	//bi-directional many-to-one association to Employee

	//@JoinColumn(name="EMPLOYEE_ID")
	private Employee employee;

	//bi-directional many-to-one association to Job

	private Job job;

	public JobHistory() {
	}

	public JobHistoryPK getId() {
		return this.id;
	}

	public void setId(JobHistoryPK id) {
		this.id = id;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Job getJob() {
		return this.job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

}