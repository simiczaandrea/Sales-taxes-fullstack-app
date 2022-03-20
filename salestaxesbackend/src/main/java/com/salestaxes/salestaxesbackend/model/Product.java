package com.salestaxes.salestaxesbackend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;


@Entity(name="product")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    private String productName;
    private boolean isImported;
    private double productsNetPrice;


    @ManyToOne
    @JoinColumn(name = "category_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Category category;

    public Product(String productName, boolean isImported, double productsNetPrice, Category category) {
        this.productName = productName;
        this.isImported = isImported;
        this.productsNetPrice = productsNetPrice;
        this.category = category;
    }
}
