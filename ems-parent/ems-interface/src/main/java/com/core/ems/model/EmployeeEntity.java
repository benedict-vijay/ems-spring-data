package com.core.ems.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ems_employee_detail")
public class EmployeeEntity implements Serializable {

	private static final long serialVersionUID = 3340224178025080834L;

	@Id
	@GeneratedValue
	@Column(name = "EMP_ID")
	private Long id;

	@Column(name = "EMP_NAME")
	private String empName;

	@Column(name = "SALARY")
	private BigDecimal salary;

	@Column(name = "DATE_OF_JOINING")
	private Date dateOfJoining;

	@Column(name = "DATE_OF_RESIGN")
	private Date dateOfResign;

	@Column(name = "IS_ACTIVE")
	private String isActive;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@Column(name = "CREATED_DATE")
	private Date createdDate;

	@Column(name = "UPDATED_BY")
	private String updatedBy;

	@Column(name = "UPDATED_DATE")
	private Date updatedDate;

	public Long getEmpId() {
		return id;
	}

	public void setEmpId(Long id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public Date getDateOfResign() {
		return dateOfResign;
	}

	public void setDateOfResign(Date dateOfResign) {
		this.dateOfResign = dateOfResign;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Override
	public String toString() {
		return "EmployeeVO [id=" + id + ", Employee Name=" + empName
				+ ", Salary=" + salary + "]";
	}
}