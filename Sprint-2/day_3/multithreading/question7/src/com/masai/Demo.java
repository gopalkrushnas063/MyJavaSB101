package com.masai;

public class Demo {

	public static void main(String[] args) {
		Dhoni t1 = new Dhoni();
		Kohli t2 = new Kohli();
		
		t1.start();
		t2.start();
		
		t1.setPriority(8);
		t2.setPriority(10);
		
		System.out.println("Dhoni thread priority : " + t1.getPriority());
		System.out.println("Kohli thread priority : " + t2.getPriority());
		
		
		
				
	}
}
