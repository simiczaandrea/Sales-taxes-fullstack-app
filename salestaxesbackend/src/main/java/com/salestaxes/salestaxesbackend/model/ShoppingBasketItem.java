package com.salestaxes.salestaxesbackend.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;


import javax.persistence.*;

@Entity(name="shopping_basket_item")
@Getter
@Setter
public class ShoppingBasketItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long shoppingBasketItemId;
    private int amount;
    private double productTaxAmount;
    private double productGrossPrice;

    @ManyToOne
    @JoinColumn(name = "product_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Product product;

}
