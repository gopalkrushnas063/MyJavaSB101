package com.masai;

public class ThreadA implements Runnable {
	
	@Override public void run() { 
		for(int i=0;i<20;i++){ 
			String tname=Thread.currentThread().getName(); 
			System.out.println(tname +" is running "+i); 
		}
		
	}
}
