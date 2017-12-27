package com.mypackage;


import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class MyScheduledThreadPoolExecutor {
	public static void main(String args[]){
		
		CustomThreadFactory ct = new CustomThreadFactory("CustomThread");
		
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(2, ct);
		
		executor.scheduleAtFixedRate(new Task(), 5, 5, TimeUnit.SECONDS);
		
		try {
			Thread.sleep(100000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		executor.shutdown();
		
	}

}
