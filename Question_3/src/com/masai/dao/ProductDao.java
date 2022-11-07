package com.masai.dao;

import com.masai.exception.ProductException;
import com.masai.model.Product;

import java.util.List;

public interface ProductDao {
    public String addProduct(Product product) throws ProductException;
    public List<Product> getAllProducts() throws ProductException;
}
