package com.care.test02;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		String path="classpath:application_test02.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		SaveClass sc = ctx.getBean("scb",SaveClass.class);
		
//		Scanner scan = new Scanner(System.in);
//		
//			System.out.print("num1 입력 : ");
//			sc.setNum1(scan.nextInt());
//			System.out.print("연산입력(+,-,*,/,%) : ");
//			sc.setOp(scan.next());
//			System.out.print("num2 입력 : ");
//			sc.setNum2(scan.nextInt());
			
			sc.printClass();
		
	}

}
