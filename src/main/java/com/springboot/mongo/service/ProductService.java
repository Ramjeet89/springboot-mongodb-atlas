package com.springboot.mongo.service;

import com.springboot.mongo.entity.Product;

import java.util.List;

public interface ProductService {

    public List<Product> getProduct();

    public Product addProduct(Product product);

    public Product deleteProduct(int id);

    public Product updateProduct(int id, Product product);

}
