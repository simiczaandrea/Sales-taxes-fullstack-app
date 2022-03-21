package com.salestaxes.salestaxesbackend.service;

import com.salestaxes.salestaxesbackend.model.Category;
import com.salestaxes.salestaxesbackend.model.Product;
import com.salestaxes.salestaxesbackend.model.ShoppingBasketItem;
import com.salestaxes.salestaxesbackend.repository.CategoryRepository;
import com.salestaxes.salestaxesbackend.repository.ProductRepository;
import com.salestaxes.salestaxesbackend.repository.ShoppingBasketItemRepository;
import com.salestaxes.salestaxesbackend.service.serviceUtils.CalculateTax;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class ShoppingBasketServiceTest {


    @Mock
    private ShoppingBasketItemRepository shoppingBasketItemRepository;
    private ShoppingBasketService shoppingBasketServiceUnderTest;

    @BeforeEach
    void setUp() {
        shoppingBasketServiceUnderTest = new ShoppingBasketService(shoppingBasketItemRepository);
    }


    @Test
    @DisplayName("Should add new item into shopping basket")
    void addItemToBasket() {
        Product product = new Product(1L, "book", false, 12.49, new Category(1L, "book", true));

        ShoppingBasketItem shoppingBasketItem = new ShoppingBasketItem(1, 1.5, 16.49, product);

        shoppingBasketServiceUnderTest.addItemToBasket(product.getProductId());

        verify(shoppingBasketItemRepository).save(shoppingBasketItem);

    }

    @Test
    @DisplayName("Test the service of get all ShoppingList items")
    void findAllShoppingBasketItemIfExists() {
        shoppingBasketServiceUnderTest.getAllShoppingBasketItem();
        verify(shoppingBasketItemRepository).getShoppingBasketItem();
    }

}