package com.pms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pms.repo.EmployeeRepo;

@Service
public class EmployeeService {

	
	@Autowired
	private EmployeeRepo employeerepo;
}
