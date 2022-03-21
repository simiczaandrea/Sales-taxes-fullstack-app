package com.salestaxes.salestaxesbackend.controller;

import com.salestaxes.salestaxesbackend.payloads.ProductView;
import com.salestaxes.salestaxesbackend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public List<ProductView> getProductsData() {
        return productService.getAllProduct();
    }

}
