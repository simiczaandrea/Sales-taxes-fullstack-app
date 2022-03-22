package com.salestaxes.salestaxesbackend.service;

import com.salestaxes.salestaxesbackend.repository.ShoppingBasketItemRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
@DataJpaTest
class ShoppingBasketServiceTest {


    @Mock
    private ShoppingBasketItemRepository shoppingBasketItemRepository;
    private ShoppingBasketService shoppingBasketServiceUnderTest;

    @BeforeEach
    void setUp() {
        shoppingBasketServiceUnderTest = new ShoppingBasketService(shoppingBasketItemRepository);
    }

    @Test
    @DisplayName("Test the service of get all ShoppingList items")
    void findAllShoppingBasketItemIfExists() {
        shoppingBasketServiceUnderTest.getAllShoppingBasketItem();
        verify(shoppingBasketItemRepository).getShoppingBasketItem();
    }

}