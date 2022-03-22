package com.salestaxes.salestaxesbackend.payloads;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddToBasketRequest {
    private long productId;
    private int amount;
}
