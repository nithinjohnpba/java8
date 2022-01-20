package in.co.java8.looseCoupling.manager;

import in.co.java8.looseCoupling.impl.Worker;

public class Manager {
private Worker worker ;
public Manager(Worker worker){
	this.worker=worker;
}
public void ManageWork(){
	this.worker.doWork();
}

}
