package com.masai;

public class ThreadB implements Runnable{
	@Override public void run() { 
		for(int i=0;i<20;i++){ 
			
			//Thread.currentThread() will return the currently running the ThreadA
 			String tname=Thread.currentThread().getName(); 
			System.out.println(tname +" is running "); 
		}
		
		System.out.println("end of ThreadA");
	}
}
