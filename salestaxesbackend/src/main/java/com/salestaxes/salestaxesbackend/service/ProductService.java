package com.salestaxes.salestaxesbackend.service;

import com.salestaxes.salestaxesbackend.model.Product;
import com.salestaxes.salestaxesbackend.payloads.ProductView;
import com.salestaxes.salestaxesbackend.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<ProductView> getAllProduct() {
        List<ProductView> productList = new ArrayList<>();

        return productList;
    }

    public Product findProductById(){
        Product product = new Product();


        return product;
    }



}
