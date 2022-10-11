package com.masai;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Demo {
	public static void main(String[] args) {
		Set<Student> studentSet = new HashSet<Student>();
		
		studentSet.add(new Student(1, "Krishna", 580));
		studentSet.add(new Student(5, "Ransmee", 320));
		studentSet.add(new Student(7, "Sushree", 510));
		studentSet.add(new Student(9, "Kanchan", 640));
		studentSet.add(new Student(6, "Nirupam", 300));
		
		
		Set<Student> filterStudent = studentSet
										.stream()
										.filter(s -> s.getMarks() < 500)
										.collect(Collectors.toSet());
		
		filterStudent.forEach(s -> System.out.println(s));
		
	}

}
