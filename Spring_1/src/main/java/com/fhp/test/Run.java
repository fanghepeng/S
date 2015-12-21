package com.fhp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {

	
	public static void main(String[] args) {
//		HelloWord hello =new HelloWord();
//			hello.call();
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring/application-config.xml");
		HelloWord hw=(HelloWord) ac.getBean("hello");
		hw.call();
		
	}
}
