package com.pms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pms.entity.EmployeeClass;

public interface EmployeeRepo extends JpaRepository<EmployeeClass, Integer> {

}
