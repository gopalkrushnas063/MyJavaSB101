package com.masai;

public class ThreadC implements Runnable{
	
	
	
	@Override
	public void run() {
		for(int i = 0;i<10;i++) {
			System.out.println("Inside run ThreadC"+i);
		}
		
		System.out.println("end threadC");
	}

}
