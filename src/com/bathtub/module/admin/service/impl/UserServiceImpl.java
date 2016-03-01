package com.bathtub.module.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bathtub.core.base.service.impl.BaseServiceImpl;
import com.bathtub.module.admin.dao.UserDAO;
import com.bathtub.module.admin.entity.User;
import com.bathtub.module.admin.service.UserService;

@Service("userService")
public class UserServiceImpl extends BaseServiceImpl implements UserService
{
	@Autowired() 
	private UserDAO userDAO;

	@Transactional
	public void saveUser(User user)
	{
		userDAO.saveUser(user);
	}
	
}
