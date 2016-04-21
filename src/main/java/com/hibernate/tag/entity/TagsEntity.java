package com.hibernate.tag.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

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
	
	private Set<TagsWorkflowReflectEntity> set;

	@Id
	@GeneratedValue(generator = "paymentableGenerator")
	@GenericGenerator(name = "paymentableGenerator", strategy = "native")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(nullable=false, length=30, unique=true)
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

	@OneToMany(mappedBy="tags", cascade={javax.persistence.CascadeType.ALL})
	//--->　　OneToMany指定了一对多的关系，mappedBy="room"指定了由多的那一方来维护关联关系，mappedBy指的是多的一方对1的这一方的依赖的属性，(注意：如果没有指定由谁来维护关联关系，则系统会给我们创建一张中间表)
	@LazyCollection(LazyCollectionOption.EXTRA)
	//--->　　LazyCollection属性设置成EXTRA指定了当如果查询数据的个数时候，只会发出一条 count(*)的语句，提高性能
	public Set<TagsWorkflowReflectEntity> getSet() {
		return set;
	}
	
	public void setSet(Set<TagsWorkflowReflectEntity> set) {
		this.set = set;
	}
}
