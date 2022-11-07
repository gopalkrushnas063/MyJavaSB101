package com.masai.usecases;

import com.masai.dao.ProductDao;
import com.masai.dao.ProductDaoImpl;
import com.masai.exception.ProductException;
import com.masai.model.Product;

import java.util.List;

public class GetAllProduct {
    public static void main(String[] args) {
        ProductDao dao = new ProductDaoImpl();
        try{
            List<Product> products = dao.getAllProducts();
            products.forEach(System.out::println);
        }catch (ProductException e){
            System.out.println(e.getMessage());
        }
    }
}
