package com.care.di02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String path = "classpath:applicationST.xml"; //classpsth = src/main/resources
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path); 
		STBean stBean = ctx.getBean("stb",STBean.class);
		
//		stBean.setName("홍길동");
//		stBean.setAge(20);
		stBean.namePrint();
		stBean.agePrint();
	}
}
