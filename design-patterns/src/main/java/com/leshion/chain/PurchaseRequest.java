package com.leshion.chain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PurchaseRequest {
    private double amount;
    private int number;
    private String purpose;

    public PurchaseRequest(double amount, int number, String purpose){
        this.amount = amount;
        this.number = number;
        this.purpose = purpose;
    }

}
