/**
 * 
 */
package com.hibernate.tag.daoImpl;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;

import com.hibernate.tag.entity.TagsEntity;
import com.hibernate.tag.utils.SpringInitalUtils;

/**
 *
 * @project hibernate_tag01
 * <p>title:TagsDaoImplTest.java</p>
 * <p>description:</p>
 * @author Qingmao
 * @date 上午10:47:26
 * @version 1.0
 *
 */
public class TagsDaoImplTest {

	private TagsDaoImpl tagsDao = null;
	/**
	 * Test method for {@link com.hibernate.tag.daoImpl.TagsDaoImpl#addTags(com.hibernate.tag.entity.TagsEntity)}.
	 */
	@Before
	public void init() {
		//System.out.println("===========================");
		ApplicationContext context = SpringInitalUtils.init();
		tagsDao = context.getBean(TagsDaoImpl.class);
	}
	
	@Test
	public void testAddTags() {
		TagsEntity tags = new TagsEntity();
		//tags.setId(1);
		tags.setName("固定资产");
		tags.setType(3);
		
		try {
			tagsDao.addTags(tags);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
	@Test
	public void testGetTagsEntityById() {
		try {
			TagsEntity tag = tagsDao.getTagsEntityById(1);
			
			TagsEntity tags = new TagsEntity();
			//tags.setId(1);
			tags.setName("固定资产");
			tags.setType(3);
			
			try {
				tagsDao.addTags(tags);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			tagsDao.getTagsEntityById(2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testGetTagsListAll() throws Exception {
		List<TagsEntity> list = tagsDao.getTagsListAll();
		System.out.println(list);
		TagsEntity tag = tagsDao.getTagsEntityById(1);
		System.out.println(tag);
	}
}
