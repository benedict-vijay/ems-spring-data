package com.core.ems.dao;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.core.ems.model.UserDetailEntity;
import com.core.ems.model.UserSessionEntity;

@Repository
public class UserDaoImpl implements UserDao 
{
	@Resource
	private UserSessionDaoRepository userSessionRepository;

	@Resource
	private UserDetailDaoRepository userDetailRepository;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public UserDetailEntity getUserByName(String userName) {
		return userDetailRepository.findUserByName(userName);
	}
	
	@Override
	public UserSessionEntity getUserSessionById(Long sessionId) {
		return userSessionRepository.findUserSessionById(sessionId, "1");
	}

	@Override
	public UserSessionEntity getActiveUserSessionByUserId(Long userId) {
		return userSessionRepository.findUserSessionByUserId(userId, "1");
	}
	
	@Override
	public boolean insertUserSession(UserSessionEntity userSession) {
		int rows = userSessionRepository.insertUserSession(userSession.getUserId(),userSession.getLoginTime(),userSession.getLogoutTime(), userSession.getIsActive(), userSession.getCreatedBy(), userSession.getCreatedDate());
		return rows > 0;
	}
	
	@Override
	public boolean updateUserSession(UserSessionEntity userSession) {
		int rows = userSessionRepository.logoutUserSession(userSession.getLogoutTime(), userSession.getIsActive(), userSession.getUserId());
		return rows > 0;
	}
	
}