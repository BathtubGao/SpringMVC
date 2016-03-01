package com.bathtub.core.base.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.bathtub.core.base.dao.BaseDao;
import com.bathtub.core.base.entity.BaseModel;
import com.bathtub.core.utils.StringUtil;

public class BaseDaoImpl implements BaseDao
{
	@Autowired()
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;
	
	public Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}
	
	public void saveObject(Object object)
	{
		if(object instanceof BaseModel)
		{
			if(StringUtil.isNotNullAndNotEmpty(((BaseModel)object).getId()))
			{
				getSession().update(object);
			}
			else
			{
				getSession().save(object);
			}
		}
		else
		{
			getSession().saveOrUpdate(object);
		}
	}
	
	public void saveOrUpdateObject(Object object)
	{
		getSession().saveOrUpdate(object);
	}
}
