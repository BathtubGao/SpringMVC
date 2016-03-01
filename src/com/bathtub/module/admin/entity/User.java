package com.bathtub.module.admin.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.bathtub.core.base.entity.BaseModel;

@Table(name = "USERS")
@Entity
public class User extends BaseModel
{

	private static final long serialVersionUID = 8568426839204401086L;

	private String password;

	private String displayName;

	private String mobile;

	private Integer sortSq;

	private String loginId;

	private Integer delFlag;


	/**
	 * 获得用户密码
	 */
	@Column(name = "password", length = 50, nullable = false)
	public String getPassword()
	{
		return this.password;
	}

	/**
	 * 获得用户名
	 */
	@Column(name = "LOGIN_ID", length = 20, nullable = false)
	public String getLoginId()
	{
		return this.loginId;
	}

	/**
	 * 获取用户的姓名
	 */
	@Column(name = "DISPLAY_NAME", length = 100, nullable = false)
	public String getDisplayName()
	{
		return displayName;
	}

	/**
	 * 设置用户的姓名
	 */
	public void setDisplayName(String displayName)
	{
		this.displayName = displayName;
	}


	/**
	 * 获取用户手机号
	 */
	@Column(name = "MOBILE", length = 11, nullable = true)
	public String getMobile()
	{
		return mobile;
	}

	/**
	 * 设置用户手机号
	 */
	public void setMobile(String mobile)
	{
		this.mobile = mobile;
	}


	/**
	 * 获取同级排序
	 */
	@Column(name = "SORT_SQ", length = 10, nullable = true)
	public Integer getSortSq()
	{
		return sortSq;
	}

	/**
	 * 设置同级排序
	 */
	public void setSortSq(Integer sortSq)
	{
		this.sortSq = sortSq;
	}


	/**
	 * 获取删除状态
	 */
	@Column(name = "DEL_FLAG", length = 1, nullable = false)
	public Integer getDelFlag()
	{
		return delFlag;
	}

	/**
	 * 设置删除状态
	 */
	public void setDelFlag(Integer delFlag)
	{
		this.delFlag = delFlag;
	}

	/**
	 * 设置用户密码
	 */
	public void setPassword(String password)
	{
		this.password = password;
	}

	/**
	 * 设置用户名
	 */
	public void setLoginId(String loginId)
	{
		this.loginId = loginId;
	}

}
