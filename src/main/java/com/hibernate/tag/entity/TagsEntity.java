package com.hibernate.tag.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.GenericGenerator;

/**
 * 
 *
 * @project hibernate_tag01
 *          <p>
 *          title:TagsEntity.java
 *          </p>
 *          <p>
 *          description:标签实体
 *          </p>
 * @author Qingmao
 * @date 下午4:00:37
 * @version 1.0
 *
 */

@Entity
@Table(name="tb_tags")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region="javaClassName")  
public class TagsEntity {

	private int id;
	private String name;
	private int type;

	@Id
	@GeneratedValue(generator = "paymentableGenerator")
	@GenericGenerator(name = "paymentableGenerator", strategy = "native")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(nullable=false, length=30)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(length=10)
	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "TagsEntity [id=" + id + ", name=" + name + ", type=" + type
				+ "]";
	}
}
