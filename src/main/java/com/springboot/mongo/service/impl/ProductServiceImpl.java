package com.springboot.mongo.service.impl;

import com.springboot.mongo.entity.Product;
import com.springboot.mongo.repository.ProductRepository;
import com.springboot.mongo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getProduct() {
        return productRepository.findAll();
    }

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product deleteProduct(int id) {
        Product product = productRepository.findById(id).get();
        productRepository.delete(product);
        return product;
    }

    @Override
    public Product updateProduct(int id, Product product) {
        Product updateVar = productRepository.findById(id).get();
        updateVar.setModelName(product.getModelName());
        return productRepository.save(product);
    }
}
