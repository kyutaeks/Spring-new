package com.osf.sp.ioc6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
//public class Company {
//
//	private List<Worker> workers;
//
//	@Autowired
//	public Company(List<Worker> workers) {
//		this.workers = workers;
//	}
//
//	public void startOperate() {
//		for(Worker worker:workers) {
//			worker.goToOffice();
//		}
//	}
//	public void operating() {
//		for(Worker worker:workers) {
//			worker.doWork();
//		}
//	}
//}

@Component
public class Company {

	private Worker w1;
	private Worker w2;
	private Worker w3;

	@Autowired
	public Company(@Qualifier("developer") Worker w1, @Qualifier("designer") Worker w2, @Qualifier("manager")Worker w3) {
		this.w1 = w1;
		this.w2 = w2;
		this.w3 = w3;

	}

	public void startOperate() {
		w1.goToOffice();
		w2.goToOffice();
		w3.goToOffice();

	}

	public void operating() {
		w1.doWork();
		w2.doWork();
		w3.doWork();

	}
}
