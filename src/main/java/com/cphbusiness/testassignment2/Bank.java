/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cphbusiness.testassignment2;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Kast
 */
public class Bank {
    
    private double round(double value, int places) {
    if (places < 0) throw new IllegalArgumentException();
 
    BigDecimal bd = new BigDecimal(Double.toString(value));
    bd = bd.setScale(places, RoundingMode.HALF_UP);
    return bd.doubleValue();
}
    
    public double calculateYearlyInterest(Account account)
    {
        if(account.getBalance() > 0 && account.getBalance() <=100)
        {
            return round(account.getBalance() * 0.03,3);
        }
        else if(account.getBalance() > 100 && account.getBalance() <= 1000)
        {
            return round(account.getBalance() * 0.05,3);
        }
        else if(account.getBalance() > 1000)
        {
            return round(account.getBalance() * 0.07,3);
        }
        
        return 0;
    }
}
