package com.masai;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		
		
		List<Integer> squares = list
								 .stream()
								 .map(i -> i*i)
								 .collect(Collectors.toList());
		System.out.println("original list of numbers : " + list);
		System.out.println("Square list of integers using Map : " + squares);


	}
}
