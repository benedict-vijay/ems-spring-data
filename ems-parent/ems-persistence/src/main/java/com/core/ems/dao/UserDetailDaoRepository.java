package com.core.ems.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.core.ems.model.UserDetailEntity;

public interface UserDetailDaoRepository extends JpaRepository<UserDetailEntity, Long> {
	
	@Query(value = "SELECT * FROM ems_user_detail WHERE USER_NAME = (:userName)", nativeQuery = true)
	UserDetailEntity findUserByName(@Param("userName") String userName);
}