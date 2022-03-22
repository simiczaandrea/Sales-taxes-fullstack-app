package com.salestaxes.salestaxesbackend.repository;

import com.salestaxes.salestaxesbackend.model.SalesTax;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxRepository extends JpaRepository<SalesTax, Long> {
    SalesTax getSalesTaxByTaxName(String taxName);
}
