package com.mypackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyCallableFutureExample {
	
	 
	
	public static void main(String args[]){
		List<Future<String>> list = new ArrayList<Future<String>>();
		CustomThreadFactory ct = new CustomThreadFactory("CustomThreadPool");
		ExecutorService executor = Executors.newCachedThreadPool(ct);
		for(int i=0;i<10;i++){
			Future <String> future = executor.submit(new MyCallable());
			list.add(future);
		}

		for( Future<?> fut:list){
			try {
				System.out.println(fut.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		executor.shutdown();
	}

}
