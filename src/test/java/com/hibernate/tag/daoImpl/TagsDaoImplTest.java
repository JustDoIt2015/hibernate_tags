
package com.hibernate.tag.daoImpl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;

import com.hibernate.tag.entity.TagsEntity;
import com.hibernate.tag.entity.TagsWorkflowReflectEntity;
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
		tags.setName("固定资产_2");
		tags.setType(3);
		
		//Set<TagsWorkflowReflectEntity> tagsSet = new HashSet<TagsWorkflowReflectEntity>();
		
		TagsWorkflowReflectEntity entity1 = new TagsWorkflowReflectEntity();
		entity1.setUuid("06BC88C161464E13A1CA5AF18779F912");
		entity1.setTags(tags);
		
		/*TagsWorkflowReflectEntity entity3 = new TagsWorkflowReflectEntity();
		entity3.setUuid("27B33F89D97D4302B47F87E2FBF1518E");
		TagsWorkflowReflectEntity entity2 = new TagsWorkflowReflectEntity();
		entity2.setUuid("2B5B52F937FF4B55BA88E754CF4A7EF9");
		tagsSet.add(entity1);
		tagsSet.add(entity2);
		tagsSet.add(entity1);	
		tags.setSet(tagsSet);*/
		
		try {
			tagsDao.addTags(entity1);
			
			
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
