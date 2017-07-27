package com.core.ems.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ems_user_session")
public class UserSessionEntity implements User {

	@Id
	@GeneratedValue
	@Column(name = "SESSION_ID")
	private Long id;
	
	@Column(name = "USER_ID")
	private Long userId;
	
	@Column(name = "LOGIN_TIME")
	private Date loginTime;
	
	@Column(name = "LOGOUT_TIME")
	private Date logoutTime;
	
	@Column(name = "IS_ACTIVE")
	private String isActive;
	
	@Column(name = "CREATED_BY")
	private String createdBy;
	
	@Column(name = "CREATED_DATE")
	private Date createdDate;

	public Long getSessionId() {
		return id;
	}

	public void setSessionId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Date getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	public Date getLogoutTime() {
		return logoutTime;
	}

	public void setLogoutTime(Date logoutTime) {
		this.logoutTime = logoutTime;
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

	@Override
	public String toString() {
		return "UserSessionEntity [sessionId=" + id + ", UserId=" + userId
				+ ", isActive=" + isActive + "]";
	}
}