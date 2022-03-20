package com.salestaxes.salestaxesbackend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;


import javax.persistence.*;

@Entity(name="shopping_basket_item")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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
