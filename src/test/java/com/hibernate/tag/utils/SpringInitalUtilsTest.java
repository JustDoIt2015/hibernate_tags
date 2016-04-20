package com.hibernate.tag.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;

public class SpringInitalUtilsTest {

	@Test
	public void test() {
		ApplicationContext context = SpringInitalUtils.init();
		SessionFactory sessionFactory = context.getBean(HibernateUtils.class).getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		
		
		
		
	}

}
