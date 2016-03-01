package com.bathtub.module.admin.dao.impl;

import org.springframework.stereotype.Repository;

import com.bathtub.core.base.dao.impl.BaseDaoImpl;
import com.bathtub.module.admin.dao.UserDAO;
import com.bathtub.module.admin.entity.User;

@Repository("userDAO")
public class UserDAOImpl extends BaseDaoImpl implements UserDAO 
{

	@Override
	public void saveUser(User user)
	{
		this.saveObject(user);
	}

}
