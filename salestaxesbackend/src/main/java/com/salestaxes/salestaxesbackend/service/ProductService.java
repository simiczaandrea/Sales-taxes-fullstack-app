package com.salestaxes.salestaxesbackend.service;

import com.salestaxes.salestaxesbackend.model.Product;
import com.salestaxes.salestaxesbackend.payloads.ProductView;
import com.salestaxes.salestaxesbackend.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<ProductView> getAllProduct() {
        return productRepository.getProducts();
    }

    public Product findProductById(Long productId){

        if(productRepository.existsByProductId(productId)){
            return productRepository.getProductByProductId(productId);
        }
        return  null;
    }

}
