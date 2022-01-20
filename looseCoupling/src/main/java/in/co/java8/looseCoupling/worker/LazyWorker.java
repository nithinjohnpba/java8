package in.co.java8.looseCoupling.worker;

import in.co.java8.looseCoupling.impl.Worker;

public class LazyWorker implements Worker{

	public void doWork() {

		System.out.println("LazyWorker is doing work");
		
	}

}
