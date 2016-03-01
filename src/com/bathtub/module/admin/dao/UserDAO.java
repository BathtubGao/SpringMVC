package com.bathtub.module.admin.dao;

import com.bathtub.core.base.dao.BaseDao;
import com.bathtub.module.admin.entity.User;

public interface UserDAO extends BaseDao
{

	public void saveUser(User user);

}
