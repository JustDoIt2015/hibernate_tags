/**
 * 
 */
package com.hibernate.tag.daoImpl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.hibernate.tag.dao.TagsDao;
import com.hibernate.tag.entity.TagsEntity;

/**
 *
 * @project hibernate_tag01
 * <p>title:TagsDaoImpl.java</p>
 * <p>description:</p>
 * @author Qingmao
 * @date 上午10:39:22
 * @version 1.0
 *
 */
@Repository
public class TagsDaoImpl implements TagsDao {

	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;
	/* (non-Javadoc)
	 * @see com.hibernate.tag.dao.TagsDao#addTags(com.hibernate.tag.entity.TagsEntity)
	 */
	public int addTags(TagsEntity tags) throws Exception {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			session.getTransaction().begin();
			session.save(tags);		
			session.getTransaction().commit();		
		} catch (Exception e) {
			session.getTransaction().rollback();
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(session!=null) {
				session.close();
			}
			session=null;
		}
		
		
		
		return 0;
	}
	/* (non-Javadoc)
	 * @see com.hibernate.tag.dao.TagsDao#getTagsEntityById(int)
	 */
	public TagsEntity getTagsEntityById(int id) throws Exception {
		Session session = null;
		TagsEntity tags = null;
		try {
			session = sessionFactory.openSession();
			session.getTransaction().begin();
			tags = session.get(TagsEntity.class, id);		
			session.getTransaction().commit();		
		} catch (Exception e) {
			session.getTransaction().rollback();
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(session!=null) {
				session.close();
			}
			session=null;
		}
		return tags;
	}
	/* (non-Javadoc)
	 * @see com.hibernate.tag.dao.TagsDao#getTagsListAll()
	 */
	@SuppressWarnings("unchecked")
	public List<TagsEntity> getTagsListAll() throws Exception {
		// TODO Auto-generated method stub
		Session session = null;
		List<TagsEntity> list = null;
		try {
			session = sessionFactory.openSession();
			session.getTransaction().begin();
			String hql = "from TagsEntity";		
			list = session.createQuery(hql).list();
			
			session.getTransaction().commit();		
		} catch (Exception e) {
			session.getTransaction().rollback();
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(session!=null) {
				session.close();
			}
			session=null;
		}
		return list;
	}

}
