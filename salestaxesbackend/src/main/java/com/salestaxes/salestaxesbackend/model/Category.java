package com.salestaxes.salestaxesbackend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity(name ="category")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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

    public Category(Long categoryId, String categoryName, boolean isTaxFree) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.isTaxFree = isTaxFree;
    }

}
