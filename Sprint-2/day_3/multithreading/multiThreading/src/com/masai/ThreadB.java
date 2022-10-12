package com.masai;

public class ThreadB extends Thread{
	
	
	@Override
	public void run() {
		for(int i = 0;i<10;i++) {
			System.out.println("Inside run ThreadB"+i);
		}
		
		System.out.println("end threadB");
	}

}
