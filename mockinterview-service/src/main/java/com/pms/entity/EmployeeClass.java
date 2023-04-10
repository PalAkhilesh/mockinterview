package com.pms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class EmployeeClass {

	
	@Id
	private int empId;
	
	private String empName;
}
