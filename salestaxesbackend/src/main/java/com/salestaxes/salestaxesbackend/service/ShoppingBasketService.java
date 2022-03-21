package com.salestaxes.salestaxesbackend.service;

import com.salestaxes.salestaxesbackend.model.ShoppingBasketItem;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShoppingBasketService {

    public ResponseEntity<?> addItemToBasket(ShoppingBasketItem item) {
        return ResponseEntity.ok("Added");
    }

    public List<ShoppingBasketItem> getAllShoppingBasketItem() {
        List<ShoppingBasketItem> shoppingBasketItems = new ArrayList<>();
        return shoppingBasketItems;
    }
}
