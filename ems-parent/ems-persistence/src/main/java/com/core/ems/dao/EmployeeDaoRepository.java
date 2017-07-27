package com.core.ems.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.core.ems.model.EmployeeEntity;

public interface EmployeeDaoRepository extends JpaRepository<EmployeeEntity, Long> {

}