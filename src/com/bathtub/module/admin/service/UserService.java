package com.bathtub.module.admin.service;

import com.bathtub.core.base.service.BaseService;
import com.bathtub.module.admin.entity.User;

public interface UserService extends BaseService 
{
	/**
	 * 保存用户
	 * 
	 * @param loginId
	 * @param password
	 * @return Boolean
	 */
	public void saveUser(User user);
}
