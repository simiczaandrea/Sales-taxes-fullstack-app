package com.salestaxes.salestaxesbackend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity(name ="category")
@Getter
@Setter
@NoArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;
    private String categoryName;
    private boolean isTaxFree;

    @JsonIgnore
    @OneToMany(mappedBy = "category", cascade={CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.REFRESH}, orphanRemoval=true)
    List<Product> productList;


    public Category(String categoryName, boolean isTaxFree, List<Product> productList) {
        this.categoryName = categoryName;
        this.isTaxFree = isTaxFree;
        this.productList = productList;
    }
}
