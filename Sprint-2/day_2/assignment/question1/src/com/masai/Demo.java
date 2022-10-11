package com.masai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
	public static void main(String[] args) {
		
		//1. Create a List of 5 product objects.

		List<Product> products = new ArrayList<>();
		
		products.add(new Product(1, "Pen", 120, 12));
		products.add(new Product(7, "Rubber", 140, 8));
		products.add(new Product(9, "Pen", 72, 6));
		products.add(new Product(3, "Pen", 170, 14));
		products.add(new Product(5, "Pen", 160, 16));
		
		
		System.out.println("..........................................");
		System.out.println("..........Original Products List..........");
		System.out.println("..........................................");
		products.forEach(System.out::println);
		
		
		//2. From the product list filter the products whose quantity is more than 10 in a separate List of Products
		Stream<Product> prod = products.stream();
		Stream<Product> prod1 = prod.filter(pr -> pr.getQuantity() < 10);
		
		
		//3. Sort the Filtered List of Products by the price in ascending order.
		List<Product> filteredList = products
										.stream()
										.filter(p1 -> p1.getQuantity() < 10)
										.collect(Collectors.toList());
		
		Collections.sort(filteredList,(p1,p2)-> p1.getPrice() > p2.getPrice() ? +1 :-1);
		System.out.println("..........................................");
		System.out.println("..........Sorted Filter List..............");
		System.out.println("..........................................");
		filteredList.forEach(p->System.out.println(p));
	}

}
