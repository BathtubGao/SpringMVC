package com.bathtub.core.base.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;



//不会映射到数据库表，但是他的属性都将映射到其子类的数据库字段中
@MappedSuperclass
public class BaseModel
{
	/** 主键 */
	protected String id;

	/** 创建时间 */
	protected Date createTime;

	/** 最近修改时间 */
	protected Date updateTime;

	/** 创建用户ID */
	protected String createUserID;

	/** 最近修改用户的ID */
	protected String updateUserID;
	
	@Id
	@Column(name="ROW_ID", length = 32, nullable = false)
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid.hex")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "CREATETIME", nullable = true)
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Column(name = "UPDATETIME", nullable = true)
	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Column(name = "CREATEUSERID", length=32, nullable = true)
	public String getCreateUserID() {
		return createUserID;
	}

	public void setCreateUserID(String createUserID) {
		this.createUserID = createUserID;
	}

	@Column(name = "UPDATEUSERID", length=32, nullable = true)
	public String getUpdateUserID() {
		return updateUserID;
	}

	public void setUpdateUserID(String updateUserID) {
		this.updateUserID = updateUserID;
	}
}
