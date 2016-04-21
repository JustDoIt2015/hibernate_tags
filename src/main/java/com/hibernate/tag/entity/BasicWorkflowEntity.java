/**
 * 
 */
package com.hibernate.tag.entity;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 *
 * @project hibernate_tag01
 * <p>title:BasicWorkflowEntity.java</p>
 * <p>description:</p>
 * @author Qingmao
 * @date 下午4:33:23
 * @version 1.0
 *
 */

//@Cache(usage=CacheConcurrencyStrategy.READ_ONLY, region="javaClassName")
public class BasicWorkflowEntity implements Serializable{
	
	private static final long serialVersionUID = -5726374138698742258L; 

	private String uuid;
	//private int type;
	private String no;
	//private String description;
	
	private String createUser;//用户信息  拉入用户？直接保存信息
	private Date createDate;
	private String createUserCompany;
	
	private String lastModifyUser;
	private Date lastModifyDate;
	
	private String currectHandler;
	
	private String statuId;
	private String statuName;
	
	
	public static String getQuerySQL(String entityClassName, String idSql) {
		
		/*return "select App_CurTask_ID as statuId, App_CurTask_Name as statuName,"
				+ "App_Handlers as currectHandler, App_CreateUser as createUser,"
				+ "App_CreateDate as createDate, App_CreateUserCompany as createUserCompany"
				+ "App_Unid as uuid, App_LastUpdateUser as lastModifyUser,"
				+ "App_LastUpdateDateTime as lastModifyDate, App_WorkflowNumber as no from " + entityClassName + " as entity"
						+ "where entity.uuid in ("
						+ idSql + ")" ;*/
		return "select App_CurTask_ID as statuId, App_CurTask_Name as statuName,"
				+ "App_Handlers as currectHandler, App_CreateUser as createUser,"
				+ "App_CreateDate as createDate,"
				+ "App_Unid as uuid,"
				+ "App_WorkflowNumber as no from " + entityClassName + " as entity"
						+ "where entity.uuid in ("
						+ idSql + ")" ;
	}


	public String getUuid() {
		return uuid;
	}


	public void setUuid(String uuid) {
		this.uuid = uuid;
	}


	public String getNo() {
		return no;
	}


	public void setNo(String no) {
		this.no = no;
	}


	public String getCreateUser() {
		return createUser;
	}


	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}


	public Date getCreateDate() {
		return createDate;
	}


	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}


	public String getCreateUserCompany() {
		return createUserCompany;
	}


	public void setCreateUserCompany(String createUserCompany) {
		this.createUserCompany = createUserCompany;
	}


	public String getLastModifyUser() {
		return lastModifyUser;
	}


	public void setLastModifyUser(String lastModifyUser) {
		this.lastModifyUser = lastModifyUser;
	}


	public Date getLastModifyDate() {
		return lastModifyDate;
	}


	public void setLastModifyDate(Date lastModifyDate) {
		this.lastModifyDate = lastModifyDate;
	}


	public String getCurrectHandler() {
		return currectHandler;
	}


	public void setCurrectHandler(String currectHandler) {
		this.currectHandler = currectHandler;
	}


	public String getStatuId() {
		return statuId;
	}


	public void setStatuId(String statuId) {
		this.statuId = statuId;
	}


	public String getStatuName() {
		return statuName;
	}


	public void setStatuName(String statuName) {
		this.statuName = statuName;
	}
	
	
}
