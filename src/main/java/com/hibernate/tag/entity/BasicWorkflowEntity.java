/**
 * 
 */
package com.hibernate.tag.entity;

import java.util.Date;

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


public class BasicWorkflowEntity {

	private String uuid;
	private int type;
	private String no;
	private String description;
	
	private String createUser;//用户信息  拉入用户？直接保存信息
	private Date createDate;
	
	private String lastModifyUser;
	private Date lastModifyDate;
}
