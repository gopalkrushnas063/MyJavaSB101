package com.masai.usecases;

import com.masai.dao.ProductDao;
import com.masai.dao.ProductDaoImpl;
import com.masai.exception.ProductException;
import com.masai.model.Product;

import java.util.Scanner;

public class ProductEnteryUseCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Product ID :");
        int pid = sc.nextInt();

        System.out.println("Enter product name :");
        String name = sc.next();

        System.out.println("Enter price : ");
        int price = sc.nextInt();

        System.out.println("Enter quantity :");
        int qty = sc.nextInt();


        ProductDao dao = new ProductDaoImpl();

        Product product = new Product(pid,name,price,qty);

        try {
            String result = dao.addProduct(product);
            System.out.println(result);
        } catch (ProductException e) {
            throw new RuntimeException(e);
        }
    }



}
