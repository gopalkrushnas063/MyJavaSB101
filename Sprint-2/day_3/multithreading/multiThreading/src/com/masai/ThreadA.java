package com.masai;

public class ThreadA implements Runnable {
	
	@Override
	public void run() {
		for(int i = 0;i<10;i++) {
			System.out.println("Inside run Thread A"+i);
		}
		
		System.out.println("end threadA");
	}
	
	public static void main(String[] args) {
		
		ThreadA ta = new ThreadA();
		
		Thread tr = new Thread(ta);
		
		tr.start();
		
		for(int i = 50 ; i< 60;i++) {
			System.out.println("inisde main of ThreadA");
		}
		
		
	}
}
