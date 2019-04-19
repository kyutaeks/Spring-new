package com.osf.sp;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Exam {
	public static void main(String[] args) {
		 ApplicationContext ap = new ClassPathXmlApplicationContext("ioc01.xml");

		Resource resource = new ClassPathResource("ioc01.xml");
		BeanFactory bFactory = new XmlBeanFactory(resource);
		Person p = (Person) bFactory.getBean("p");
		Dog d = (Dog)bFactory.getBean("d");
		Student s = (Student)bFactory.getBean("s".toString());

	}

}