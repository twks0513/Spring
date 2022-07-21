package com.care.di;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		STBean stBean = new STBean();
		
		
		
		stBean.setName("홍길동111");
		stBean.setAge(20);
		stBean.namePrint();
		stBean.agePrint();
	}
}
