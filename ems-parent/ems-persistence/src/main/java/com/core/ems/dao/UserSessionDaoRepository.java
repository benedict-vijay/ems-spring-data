package com.core.ems.dao;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.core.ems.model.UserSessionEntity;

public interface UserSessionDaoRepository extends JpaRepository<UserSessionEntity, Long> {
	@Query(value = "SELECT * FROM ems_user_session WHERE SESSION_ID = (:sessionId) and IS_ACTIVE = (:isActive)", nativeQuery = true)
	UserSessionEntity findUserSessionById(@Param("sessionId") Long sessionId, @Param("isActive") String isActive);

	@Query(value = "SELECT * FROM ems_user_session WHERE USER_ID = (:userId) and IS_ACTIVE = (:isActive)", nativeQuery = true)
	UserSessionEntity findUserSessionByUserId(@Param("userId") Long userId, @Param("isActive") String isActive);

	@Modifying
	@Query(value = "insert into ems_user_session (USER_ID, LOGIN_TIME, LOGOUT_TIME, IS_ACTIVE, CREATED_BY, CREATED_DATE) VALUES ((:userId),(:loginTime),(:logoutTime),(:isActive),(:createdBy),(:createdDate))", nativeQuery = true)
	int insertUserSession(@Param("userId") Long userId, 
											  @Param("loginTime") Date loginTime, 
											  @Param("logoutTime") Date logoutTime, 
											  @Param("isActive") String isActive,
											  @Param("createdBy") String createdBy,
											  @Param("createdDate") Date createdDate);
	@Modifying
	@Query(value = "update ems_user_session set LOGOUT_TIME = (:logoutTime), IS_ACTIVE = (:isActive) WHERE USER_ID = (:userId)", nativeQuery = true)
	int logoutUserSession(@Param("logoutTime") Date logoutTime, 
			                            @Param("isActive") String isActive, 
			                            @Param("userId") Long userId);
	
}