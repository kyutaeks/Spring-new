package com.osf.sp.ioc6;

import org.springframework.stereotype.Component;

@Component
public class Manager extends Worker {

	public Manager() {
		super("매니저", "IT팀");
	}

	@Override
	public void doWork() {
		System.out.println("작업중");

	}

	@Override
	public void goToOffice() {
		System.out.println("가는중");

	}

}
