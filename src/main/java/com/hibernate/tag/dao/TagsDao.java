/**
 * 
 */
package com.hibernate.tag.dao;

import java.util.List;

import com.hibernate.tag.entity.TagsEntity;

/**
 *
 * @project hibernate_tag01
 * <p>title:TagsDao.java</p>
 * <p>description:</p>
 * @author Qingmao
 * @date 上午10:37:40
 * @version 1.0
 *
 */
public interface TagsDao {

	public int addTags(TagsEntity tags) throws Exception;
	
	public TagsEntity getTagsEntityById(int id) throws Exception;

	public List<TagsEntity> getTagsListAll() throws Exception;
}
