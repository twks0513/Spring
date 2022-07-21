package com.care.di02;

public class STBean {
	private String name;
	private int age;
	private Student st;
	public STBean() {
		st = new Student(); //의존성을 갖고 있다
	}
	public void namePrint() {
		st.namePrint(name);
	}
	public void agePrint() {
		st.agePrint(age);
	}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
	public Student getSt() {return st;}
	public void setSt(Student st) {this.st = st;}
	
}
