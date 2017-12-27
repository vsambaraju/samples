package com.mypackage;

import java.util.List;
import java.util.concurrent.ThreadFactory;

public class CustomThreadFactory implements ThreadFactory {
	
	private String name;
	
	private int counter;
	
	private List<String> stats;
	
	public CustomThreadFactory(String name){
		this.name=name;
	}

	@Override
	public Thread newThread(Runnable r) {
	 Thread t= new Thread(r,name+"-thread-"+counter);
	 //stats.add(t.getName());
	 counter++;
	return t;
	}
	
	public String getStats(){
		
		
		return stats.toString();
		
	}

}
