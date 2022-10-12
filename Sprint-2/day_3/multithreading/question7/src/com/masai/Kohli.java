package com.masai;

public class Kohli extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Kohli Thread" + i);
		}
		
	}

}
