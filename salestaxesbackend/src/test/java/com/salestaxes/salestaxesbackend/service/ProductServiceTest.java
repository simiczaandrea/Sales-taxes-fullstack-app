package com.salestaxes.salestaxesbackend.service;

import com.salestaxes.salestaxesbackend.repository.ProductRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;
    private ProductService productServiceUnderTest;

    @BeforeEach
    void setUp() {
        productServiceUnderTest = new ProductService(productRepository);
    }


    @Test
    @DisplayName("Get all products from database")
    void canGetAllProduct() {
        productServiceUnderTest.getAllProduct();

        verify(productRepository).getProducts();
    }

    @Test
    @DisplayName("Find product by product Id if it's exist")
    void findProductById() {
        long productId = 1;
        productServiceUnderTest.findProductById();
        verify(productRepository).existsByProductId(productId);
    }

    @Test
    @DisplayName("Product is not found")
    void ProductIsNotFound() {
        long productId = 15;

        given(productRepository.existsByProductId(productId))
                .willReturn(false);

        assertThatThrownBy(() -> productServiceUnderTest.findProductById())
                .isInstanceOf(RuntimeException.class);
    }
}