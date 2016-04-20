package com.hibernate.tag.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringInitalUtils {

	public static ApplicationContext init() {
		return new ClassPathXmlApplicationContext("springmvc-servlet.xml");
	}
}
