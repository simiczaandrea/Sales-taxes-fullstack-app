package com.salestaxes.salestaxesbackend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "sales_taxes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SalesTax {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long taxId;
    private String taxName;
    private double taxAmount;
}
