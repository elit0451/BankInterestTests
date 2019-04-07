/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cphbusiness.testassignment2;

/**
 *
 * @author Kast
 */
public class Account {
    private String name;
    private int balance;
        
    public Account(String n, int b)
    {
        name = n;
        balance = b;
    }
    
    public int getBalance()
    {
        return balance;
    }
    
    public void updateBalance(int newBalance)
    {
        balance = newBalance;
    }
}
