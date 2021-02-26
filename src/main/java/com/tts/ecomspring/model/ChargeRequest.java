package com.tts.ecomspring.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
@Data
public class ChargeRequest {

    public enum Currency{
     EUR,USD;
    }


    private String Description;
    private int Amount;
    private Currency Currency;
    private String StripeEmail;
    private String StripeToken;

}
