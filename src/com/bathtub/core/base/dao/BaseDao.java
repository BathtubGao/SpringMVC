package com.bathtub.core.base.dao;

import java.util.List;
import java.util.Map;

import org.hibernate.Session;

public interface BaseDao
{
	/**
	 * 获得Session
	 * 
	 * @return Session   
	 */
	public Session getSession();
	
	
	/**
	 * 保存实体类
	 * 
	 * @param object
	 * @return void
	 */
	void saveObject(Object object);
	
	/**
	 * 保存或更新对象
	 * 
	 * @param object
	 * @return void   
	 */
	public void saveOrUpdateObject(Object object);
	
}
