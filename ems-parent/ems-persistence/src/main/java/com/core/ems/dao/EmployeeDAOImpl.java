package com.core.ems.dao;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.core.ems.model.EmployeeEntity;

@Repository
public class EmployeeDAOImpl implements EmployeeDao 
{

	@Resource
	private EmployeeDaoRepository daoRepository;
	
	@Override
	public List<EmployeeEntity> getEmployeeList() {
		return daoRepository.findAll();
	}

	@Override
	public EmployeeEntity getEmployeeById(Long empId) {
		return daoRepository.findOne(empId);
	}

	@Override
	public boolean insertEmployee(EmployeeEntity employee) {
		EmployeeEntity emp = daoRepository.save(employee);
		return emp.getEmpId() != null;
	}

	@Override
	public boolean updateEmployee(EmployeeEntity employee) {
		EmployeeEntity emp = daoRepository.save(employee);
		return emp.getEmpId() != null;
	}

	@Override
	public boolean deleteEmployee(EmployeeEntity employee) {
		boolean success = false;
		try {
			daoRepository.delete(employee);
			success = true;
		} catch (Exception e) {
			e.printStackTrace();
			success = false;
		}
		return success;
	}

}