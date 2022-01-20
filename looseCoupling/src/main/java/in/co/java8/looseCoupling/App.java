package in.co.java8.looseCoupling;

import in.co.java8.looseCoupling.impl.Worker;
import in.co.java8.looseCoupling.manager.Manager;
import in.co.java8.looseCoupling.worker.ExtraOrdiaryWorker;
import in.co.java8.looseCoupling.worker.LazyWorker;
import in.co.java8.looseCoupling.worker.SmartWorker;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ExtraOrdiaryWorker extraOrdiaryWorker=new ExtraOrdiaryWorker();
        Manager manager1=new Manager(extraOrdiaryWorker);
        manager1.ManageWork();
        
        LazyWorker lazyWorker=new LazyWorker();
        Manager manager2=new Manager(lazyWorker);
        manager2.ManageWork();
        
        SmartWorker smartWorker=new SmartWorker();
        Manager manager3=new Manager(smartWorker);
        manager3.ManageWork();
        
        
    }
}
