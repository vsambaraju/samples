package com.mypackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class MyCachedThreadPoolExecutor {
	
	public static void main(String args[]){
		CustomThreadFactory ct=new CustomThreadFactory("CustomThreads");
		ExecutorService executor = Executors.newCachedThreadPool(ct);
		for(int i=0;i<10;i++){
			executor.execute(new Task());
		}
		executor.shutdown();
		while(!executor.isShutdown()){
		}
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("ended"+ ct.getStats());
	}

}
