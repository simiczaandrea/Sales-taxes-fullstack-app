package com.salestaxes.salestaxesbackend.service;

import com.salestaxes.salestaxesbackend.model.Product;
import com.salestaxes.salestaxesbackend.model.ShoppingBasketItem;
import com.salestaxes.salestaxesbackend.repository.ShoppingBasketItemRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ShoppingBasketService {

    private final ShoppingBasketItemRepository shoppingBasketItemRepository;

    public ResponseEntity<?> addItemToBasket(Long productId) {
        return ResponseEntity.ok("Added");
    }

    public List<ShoppingBasketItem> getAllShoppingBasketItem() {
        List<ShoppingBasketItem> shoppingBasketItems = new ArrayList<>();
        return shoppingBasketItems;
    }
}
