package com.masai;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Demo {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
	
		students.add(new Student(1, "N1", 120));
		students.add(new Student(2, "N4", 340));
		students.add(new Student(3, "N3", 480));
		students.add(new Student(7, "N5", 650));
		students.add(new Student(3, "N1", 380));
	
		Optional<Student> opt = students
									.stream()
									.max((s1,s2) -> s1.getMarks() > s2.getMarks() ? +1 : -1);
		Student maxScoreStudent = opt.get();
		System.out.println("Maximum score of student details : "+ maxScoreStudent);
	}
}
