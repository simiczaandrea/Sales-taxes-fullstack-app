package com.salestaxes.salestaxesbackend.repository;

import com.salestaxes.salestaxesbackend.model.Category;
import com.salestaxes.salestaxesbackend.model.Product;
import com.salestaxes.salestaxesbackend.payloads.ProductView;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
class ProductRepositoryTest {

    @Autowired
    private ProductRepository underTestProduct;

    @Autowired
    private  CategoryRepository underTestCategory;


    @Test
    @DisplayName("Getting Products from database")
    void itShouldCheckIfAllProductSelected() {
        List<Category> categories = new ArrayList<>();
        categories.add(new Category(1L, "book", true));
        categories.add(new Category(2L, "food", true));
        categories.add(new Category(4L, "music", false));
        categories.add(new Category(5L, "perfume", false));

        underTestCategory.saveAll(categories);

        List<Product> products = new ArrayList<>();
        products.add(new Product(1L, "book", false, 12.49, new Category(1L, "book", true)));
        products.add(new Product(2L, "music CD", false, 14.99, new Category(4L, "music", false)));
        products.add(new Product(3L, "chocolate bar", false, 0.85, new Category(2L, "food", true)));
        products.add(new Product(4L, "box of chocolates", true, 10.0, new Category(2L, "food", true)));


        underTestProduct.saveAll(products);

        List<ProductView> expected = underTestProduct.getProducts();


        assertNotNull(expected);
    }
}