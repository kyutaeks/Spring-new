package com.osf.sp.ioc4;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("p")
public class Person {
	private String name;
	private Integer age;
}
