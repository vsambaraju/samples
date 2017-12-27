package com.mypackage;

public class Task implements Runnable {

	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName()+" started");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+" ended");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
