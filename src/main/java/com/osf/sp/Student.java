package com.osf.sp;

public class Student {
	private String str = "내가 세번째";

	public String getStr() {
		return str;
	}

	@Override
	public String toString() {
		return "Student [str=" + str + "]";
	}

	public void setStr(String str) {
		this.str = str;
	}
	public Student(int age) {
		System.out.println(4);
	}
}
