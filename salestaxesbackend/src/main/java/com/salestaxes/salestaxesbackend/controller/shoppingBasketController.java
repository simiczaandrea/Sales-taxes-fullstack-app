package com.salestaxes.salestaxesbackend.controller;

import com.salestaxes.salestaxesbackend.model.ShoppingBasketItem;
import com.salestaxes.salestaxesbackend.payloads.AddToBasketRequest;
import com.salestaxes.salestaxesbackend.service.ShoppingBasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class shoppingBasketController {

    @Autowired
    ShoppingBasketService shoppingBasketService;

    @PostMapping("/saveToBasket")
    public ResponseEntity<?> saveItemToShoppingBasket(@RequestBody AddToBasketRequest addToBasketRequest){
        return shoppingBasketService.addItemToBasket(addToBasketRequest);
    }

    @GetMapping("/shoppingBasket")
    public List<ShoppingBasketItem> getShoppingBasketItemData(){
        return shoppingBasketService.getAllShoppingBasketItem();
    }
}
