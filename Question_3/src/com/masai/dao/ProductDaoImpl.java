package com.masai.dao;

import com.masai.exception.ProductException;
import com.masai.model.Product;
import com.masai.utility.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDaoImpl implements ProductDao{
    @Override
    public String addProduct(Product product) throws ProductException {
        String message = "Not Inserted..";

        try (Connection conn = DBUtil.ProvideConnection()){
           PreparedStatement ps = conn.prepareStatement("INSERT INTO PRODUCT VALUES (?,?,?,?)");
           ps.setInt(1,product.getProductId());
           ps.setString(2,product.getProductName());
           ps.setInt(3,product.getPrice());
           ps.setInt(4,product.getQuantity());


           int x = ps.executeUpdate();

           if(x>0){
               message = "Product details updated....";
           }
        }catch (SQLException e){
            e.printStackTrace();
            throw new ProductException(e.getMessage());
        }
        return message;
    }

    @Override
    public List<Product> getAllProducts() throws ProductException {
        List<Product> products = new ArrayList<>();
        try (Connection conn = DBUtil.ProvideConnection()){
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM PRODUCT");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int id = rs.getInt("productid");
                String n = rs.getString("productname");
                int p = rs.getInt("price");
                int q = rs.getInt("quantity");

                Product product = new Product(id,n,p,q);

                products.add(product);
            }
        }catch (SQLException e){
            e.printStackTrace();
            throw new ProductException(e.getMessage());
        }
        return products;
    }
}
