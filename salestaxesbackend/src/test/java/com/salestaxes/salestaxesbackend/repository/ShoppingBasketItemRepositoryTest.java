package com.salestaxes.salestaxesbackend.repository;

import com.salestaxes.salestaxesbackend.model.Category;
import com.salestaxes.salestaxesbackend.model.Product;
import com.salestaxes.salestaxesbackend.model.ShoppingBasketItem;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class ShoppingBasketItemRepositoryTest {

    @Autowired
    ShoppingBasketItemRepository underTest;

    @Autowired
    private ProductRepository underTestProduct;

    @Autowired
    private  CategoryRepository underTestCategory;

    @Test
    void getShoppingBasketItem() {
        List<Category> categories = new ArrayList<>();
        categories.add(new Category(1L,"book",true));
        categories.add(new Category(2L,"food",true));
        categories.add(new Category(4L, "music", false));
        categories.add(new Category(5L, "perfume", false));

        underTestCategory.saveAll(categories);

        List<Product> products = new ArrayList<>();
        products.add(new Product(1L, "book",false, 12.49, new Category(1L,"book",true)));
        products.add(new Product(2L, "music CD",false, 14.99, new Category(4L, "music", false)));
        products.add(new Product(3L, "chocolate bar",false, 0.85, new Category(2L,"food",true)));
        products.add(new Product(4L, "box of chocolates",true, 10.0, new Category(2L,"food",true)));
        // products.add(new Product(5L, "bottle of perfume",true, 47.5, new Category(5L,"perfume",false)));

        underTestProduct.saveAll(products);

        List<ShoppingBasketItem> shoppingBasketItems = new ArrayList<>();

        shoppingBasketItems.add(
                new ShoppingBasketItem(1L, 1, 0, 12.49,
                        new Product(1L, "book", false, 12.49,
                                new Category(1L, "book", true)
                        )
                )
        );

        shoppingBasketItems.add(
                new ShoppingBasketItem(
                        2L, 1, 1.50, 16.49,
                        new Product(2L, "music CD",false, 14.99,
                                new Category(4L, "music", false)
                        )
            )
        );

        shoppingBasketItems.add(new ShoppingBasketItem(
                3L, 1, 0, 0.85,
                new Product(3L, "chocolate bar",false, 0.85,
                        new Category(2L,"food",true)
                )
            )
        );

        underTest.saveAll(shoppingBasketItems);

        List<ShoppingBasketItem> expected = underTest.getShoppingBasketItem();


        assertNotNull(expected);


    }
}