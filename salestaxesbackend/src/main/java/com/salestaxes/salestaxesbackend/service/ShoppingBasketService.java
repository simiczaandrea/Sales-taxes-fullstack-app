package com.salestaxes.salestaxesbackend.service;

import com.salestaxes.salestaxesbackend.model.Product;
import com.salestaxes.salestaxesbackend.model.ShoppingBasketItem;
import com.salestaxes.salestaxesbackend.payloads.AddToBasketRequest;
import com.salestaxes.salestaxesbackend.repository.ShoppingBasketItemRepository;
import com.salestaxes.salestaxesbackend.service.serviceUtils.CalculateTax;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import static java.lang.Math.round;

@Service
public class ShoppingBasketService {

    private final ShoppingBasketItemRepository shoppingBasketItemRepository;
    public ShoppingBasketService(ShoppingBasketItemRepository shoppingBasketItemRepository) {
        this.shoppingBasketItemRepository = shoppingBasketItemRepository;
    }

    @Autowired
    CalculateTax calculateTax;

    @Autowired
    ProductService productService;


    public ResponseEntity<?> addItemToBasket(@RequestBody AddToBasketRequest addToBasketRequest) {

        Product product = productService.findProductById(addToBasketRequest.getProductId());
        ResponseEntity<?> response;
        double taxSummary = 0;
        double productGrossPrice;

        if(product == null){
            response = ResponseEntity.badRequest().body("Product is  not found!");
            throw new RuntimeException("Recipe not found!");
        }

        if(!product.getCategory().isTaxFree()){
            taxSummary += calculateTax.calculateSalesTax(product.getProductsNetPrice());
        }

        if(product.isImported()){
            taxSummary += calculateTax.calculateImportTax(product.getProductsNetPrice());
        }

        productGrossPrice = round((product.getProductsNetPrice() + taxSummary) * 100.0) / 100.0;

        ShoppingBasketItem shoppingBasketItem = new ShoppingBasketItem(addToBasketRequest.getAmount(), taxSummary, productGrossPrice, product);

        shoppingBasketItemRepository.save(shoppingBasketItem);

        response = ResponseEntity.ok("Product added to shopping basket");

        return response;
    }

    public List<ShoppingBasketItem> getAllShoppingBasketItem() {
        return shoppingBasketItemRepository.getShoppingBasketItem();
    }
}
