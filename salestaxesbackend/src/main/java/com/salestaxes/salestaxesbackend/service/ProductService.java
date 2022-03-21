package com.salestaxes.salestaxesbackend.service;

import com.salestaxes.salestaxesbackend.payloads.ProductView;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {


    public List<ProductView> getAllProduct() {
        List<ProductView> productList = new ArrayList<>();

        return productList;
    }
}
