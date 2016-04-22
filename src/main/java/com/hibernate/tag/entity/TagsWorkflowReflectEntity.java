/**
 * 
 */
package com.hibernate.tag.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @project hibernate_tag01
 * <p>title:TagsWorkflowReflectEntity.java</p>
 * <p>description:</p>
 * @author Qingmao
 * @date 上午11:21:03
 * @version 1.0
 *
 */
@Entity
@Table(name="tb_tags_workflow", indexes={@Index(columnList="uuid",name="uuid")})
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY, region="javaClassName")
public class TagsWorkflowReflectEntity {
	
	
	private int id;
	
	private String uuid;
	
	private TagsEntity tags;


	@Column(length=40)
	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	
	@ManyToOne(fetch=FetchType.LAZY, cascade={CascadeType.ALL})//---> ManyToOne指定了多对一的关系，fetch=FetchType.LAZY属性表示在多的那一方通过延迟加载的方式加载对象(默认不是延迟加载)
    @JoinColumn(name="tags_id")//--->　　通过 JoinColumn 的name属性指定了外键的名称 rid　(注意：如果我们不通过JoinColum来指定外键的名称，系统会给我们声明一个名称)
	public TagsEntity getTags() {
		return tags;
	}

	public void setTags(TagsEntity tags) {
		this.tags = tags;
	}

	@Id
	@GeneratedValue(generator="paymentableGenerator")
	@GenericGenerator(name = "paymentableGenerator", strategy = "native")
	@Column(name="id")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
