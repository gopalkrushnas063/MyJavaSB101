package com.masai;

public class Demo {
	
	public static void main(String[] args) {
		ThreadA ta = new ThreadA();
		ThreadB tb = new ThreadB();
		
		Thread tr1 = new Thread(ta);
		Thread tr2 = new Thread(tb);
		
		tr1.setName("Raj");
		tr2.setName("Simran");
		
		
		tr1.start();
		tr2.start();
		
		Thread.currentThread().setName("XYZ Thread");
		
		System.out.println("Inside main methid "+Thread.currentThread().getName());
		
	}

}
