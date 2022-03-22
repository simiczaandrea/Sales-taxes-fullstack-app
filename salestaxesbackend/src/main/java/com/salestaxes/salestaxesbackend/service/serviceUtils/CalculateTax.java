package com.salestaxes.salestaxesbackend.service.serviceUtils;

import com.salestaxes.salestaxesbackend.model.SalesTax;
import com.salestaxes.salestaxesbackend.repository.TaxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static java.lang.Math.round;


@Service
public class CalculateTax {

    @Autowired
    private TaxRepository taxRepository;

    public double calculateSalesTax(double productNetPrice) {
        double result;
        SalesTax salesTax = taxRepository.getSalesTaxByTaxName("sales tax");

        result = (salesTax.getTaxAmount() * productNetPrice) / 100;

        result = round(result * 100.0) / 100.0;

        return result;
    }

    public double calculateImportTax(double productNetPrice){
        double result;
        SalesTax salesTax = taxRepository.getSalesTaxByTaxName("import tax");

        result = (salesTax.getTaxAmount() * productNetPrice) / 100;

        result = round(result * 100.0) / 100.0;

        return result;
    }

}
