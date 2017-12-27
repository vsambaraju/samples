package com.mypackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThreadPoolExecutor {
	public static void main(String args[]){
		ExecutorService executor = Executors.newFixedThreadPool(3) ;
		
		for(int i=0;i<10;i++){
			WorkerThread worker = new WorkerThread(""+i);
			executor.execute(worker);
		}
		
		executor.shutdown();
		
		while(!executor.isTerminated()){
			
		}
		System.out.println("Finished Executing");
	}

}
