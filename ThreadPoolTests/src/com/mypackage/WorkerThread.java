package com.mypackage;

public class WorkerThread implements Runnable{
	
	private String command;
	
	public WorkerThread(String s){
		this.command=s;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+" Start Command ="+command);
		processCommand();
		System.out.println(Thread.currentThread().getName()+" End");
		
	}
	
	public void processCommand(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
