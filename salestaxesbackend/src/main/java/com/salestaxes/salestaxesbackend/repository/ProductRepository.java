package com.salestaxes.salestaxesbackend.repository;

import com.salestaxes.salestaxesbackend.model.Product;
import com.salestaxes.salestaxesbackend.payloads.ProductView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
    @Query(value = "SELECT p FROM product p")
    List<ProductView> getProducts();
    Product getProductByProductId(Long productId);
    Boolean existsByProductId(Long productId);
}

