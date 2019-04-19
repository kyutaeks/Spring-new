package com.osf.sp.ioc6;

import org.springframework.stereotype.Component;

@Component
public class Designer extends Worker {
	public Designer() {
		super("디자이너", "IT팀");
	}

	@Override
	public void doWork() {
		System.out.println("나도 일한다");
	}

	@Override
	public void goToOffice() {
		System.out.println("나는 왜?");
	}

}
