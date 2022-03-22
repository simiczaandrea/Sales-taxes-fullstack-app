package com.salestaxes.salestaxesbackend.service.serviceUtils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

//to run this test you should comment out H2 db adn uncomment normal db
// it's only read data from it, don't modify anything

@SpringBootTest
@RunWith(SpringRunner.class)
class CalculateTaxTest {

    @Autowired
    private CalculateTax underTestCalculateTax;

    @Test
    @DisplayName("Return tha amount of sales tax for not tax free product")
    void calculateSalesTaxIfNotTaxFree() {
        double productNetPrice = 14.99;

        double result = underTestCalculateTax.calculateSalesTax(productNetPrice);

        assertEquals(1.50, result, "calculating sales tax amount");
    }


    @Test
    @DisplayName("Return tha amount of sales tax for tax free product")
    void calculateImportTaxForImportedProduct() {
        double importedProductNetPrice = 10.00;

        double result = underTestCalculateTax.calculateImportTax(importedProductNetPrice);

        assertEquals(0.50, result, "calculating imported tax amount");
    }

}