package com.salestaxes.salestaxesbackend.repository;

import com.salestaxes.salestaxesbackend.model.ShoppingBasketItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShoppingBasketItemRepository extends JpaRepository<ShoppingBasketItem, Long> {
    @Query(value = "SELECT sbi FROM shopping_basket_item sbi")
    List<ShoppingBasketItem> getShoppingBasketItem();
}
