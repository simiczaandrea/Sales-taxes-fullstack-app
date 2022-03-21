package com.salestaxes.salestaxesbackend.service;

import org.springframework.stereotype.Service;

import java.text.DecimalFormat;

import static java.lang.Math.round;

@Service
public class CalculateTaxService {

    private double calculateSalesTax(double productNetPrice) {
        double net = 14.99;
        double x = net * 0.10;
        double rounded = round(x * 20.0) / 20.0;

        System.out.println(rounded);

        double result = net + rounded;
        DecimalFormat df = new DecimalFormat("###.###");
        System.out.println(df.format(result));

        return 0;
    }

    private double calculateImportTax(double productNetPrice){
        return 0;
    }
}
