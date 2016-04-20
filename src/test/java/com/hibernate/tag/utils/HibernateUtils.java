/**
 * 
 */
package com.hibernate.tag.utils;

import java.nio.channels.SeekableByteChannel;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @project hibernate_tag01
 * <p>title:HibernateUtils.java</p>
 * <p>description:</p>
 * @author Qingmao
 * @date 下午3:26:32
 * @version 1.0
 *
 */
@Repository
public class HibernateUtils {

	@Autowired
	private SessionFactory sessionFactory = null;
	
	public SessionFactory getSessionFactory() {
		return this.sessionFactory;
	}
	
}
