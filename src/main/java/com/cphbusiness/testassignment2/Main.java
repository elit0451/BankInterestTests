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
public class Main {
    public static void main(String[] args)
    {
        new Main().run();
    }
    
    private void run()
    {
        Account a1 = new Account("User A", 50);
        Account a2 = new Account("User B", 150);
        Account a3 = new Account("User C", 10000);
        
        System.out.println(new Bank().calculateYearlyInterest(a1));
        System.out.println(new Bank().calculateYearlyInterest(a2));
        System.out.println(new Bank().calculateYearlyInterest(a3));
    }
}
