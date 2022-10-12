package com.masai;


public class X extends Thread{
	
	@Override
	public void run() {
		System.out.println("Inside run method of X");
		for(int i = 0;i<10;i++) {
			System.out.println("inside run method "+i);
		}
		
		System.out.println("end of run method of X");
	}
	
	
	public static void main(String[] args) {
		
		// --> main thread
		System.out.println("Inside the main of X class");
		
		X x1 = new X();
		
		//x1.run();
		x1.start(); // --> 2 threads
		
		
		for (int i=30;i<40;i++) {
			System.out.println("inside main "+i);
		}
		
		System.out.println("End of main of X");
		
	}

}
