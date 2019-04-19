package com.osf.sp;

public class Person {
	private String str = "내가첫번째";

	// public Person(String str) {
	// super();
	// this.str = str;
	// }

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	@Override
	public String toString() {
		return "Person [str=" + str + "]";
	}

	public Person() {
		System.out.println(str);
	}

}
