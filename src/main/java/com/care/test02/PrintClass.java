package com.care.test02;

public class PrintClass {
	public void printFunc(int num1,String op,int num2,int result) {
		OperationClass oc = new OperationClass();
		result = oc.operation(num1,num2,op);
		System.out.println(num1+" "+op+" "+num2+" = "+result);
		
	}
}
