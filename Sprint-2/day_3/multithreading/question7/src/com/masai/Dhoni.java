package com.masai;

public class Dhoni extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Dhoni Thread" + i);
		}
		
	}

}
