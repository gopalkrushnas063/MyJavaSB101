package com.masai;

public class Demo {
	
	public static void main(String[] args) {
		//shared resource
		ThreadA ta = new ThreadA();
		
		Thread tr1 = new Thread(ta);
		Thread tr2 = new Thread(ta);
		
		tr1.setName("Raj");
		tr2.setName("Simran");
		
		
		tr1.start();
		tr2.start();
		
		
		
	}

}
