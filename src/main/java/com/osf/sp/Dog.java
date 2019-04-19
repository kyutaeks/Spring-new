package com.osf.sp;

public class Dog {
	private String str = "내가 두번째";

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	@Override
	public String toString() {
		return "Dog [str=" + str + "]";
	}
	public Dog() {
		System.out.println(str);
	}
}
