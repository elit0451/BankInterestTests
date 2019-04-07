package com.cphbusiness.testassignment2;

import java.time.Duration;
import static java.time.Duration.ofSeconds;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class JavaTest {
    Account acc;
    Bank b;
    
   public JavaTest() {
        acc = new Account("Test",0);
        b = new Bank();
    }
    @Test
   public void testNegativeBalance(){
      acc.updateBalance(-1);
      
      double interestRate = b.calculateYearlyInterest(acc);
      
      assertTrue(interestRate == 0);
   }
    @Test
   public void testFirstBoundary()
   {
       acc.updateBalance(100);
      
      double interestRate = b.calculateYearlyInterest(acc);
      
      assertTrue(interestRate == 3);
   }
    @Test
   public void testSecondBoundary()
   {
       acc.updateBalance(1000);
      
      double interestRate = b.calculateYearlyInterest(acc);
      
      assertTrue(interestRate == 50);
   }
    @Test
   public void testThirdBoundary()
   {
       acc.updateBalance(10000);
      
      double interestRate = b.calculateYearlyInterest(acc);
      
      assertTrue(interestRate == 700);
   }
    @Test  
   public void testEightAssertions()
   {
       Account fakeNewAccount = new Account("Test2",2);
       Account nullAccount = null;
       
       assertEquals(acc, acc);
       assertFalse(false);
       assertNotEquals(acc, fakeNewAccount);
       assertNotNull(acc);
       assertTrue(true);
       assertSame(acc, acc);
       assertNotSame(fakeNewAccount, acc);
       assertNull(nullAccount);
   }
   
   @Test
   public void renamingTheEightAssertions()
   {
       Account fakeNewAccount = new Account("Test2",2);
       Account nullAccount = null;
       
       assertEquals(acc, acc);
       assertFalse(false);
       assertNotEquals(acc, fakeNewAccount);
       assertNotNull(acc);
       assertTrue(true);
       assertSame(acc, acc);
       assertNotSame(fakeNewAccount, acc);
       assertNull(nullAccount);
   }
   
   @Test
   public void testEightDifferentAssertsWithAssumption()
   {
       Boolean randomBoolean = Math.random() < 0.5;
       
       assumeTrue(randomBoolean);
       
       Account fakeNewAccount = new Account("Test2",2);
       Account nullAccount = null;
       
       assertEquals(acc, acc);
       assertFalse(false);
       assertNotEquals(acc, fakeNewAccount);
       assertNotNull(acc);
       assertTrue(true);
       assertSame(acc, acc);
       assertNotSame(fakeNewAccount, acc);
       assertNull(nullAccount);
       
       System.out.println("Running because its true");
   }
   
   //The following test shoould fail.
   @Test
   public void testEightDifferentAssertsWithSleep()
   {
       assertTimeout(ofSeconds(5), () ->
       {
           new Thread().sleep(8000);
        }, "Timed out");
      
       
       Account fakeNewAccount = new Account("Test2",2);
       Account nullAccount = null;
       
       assertEquals(acc, acc);
       assertFalse(false);
       assertNotEquals(acc, fakeNewAccount);
       assertNotNull(acc);
       assertTrue(true);
       assertSame(acc, acc);
       assertNotSame(fakeNewAccount, acc);
       assertNull(nullAccount);
       
   }
   
   //This test is not supposed to pass.
   @Test
   public void testEightDifferentAssertsWithLambda()
   {
       Account fakeNewAccount = new Account("Test2",2);
       Account nullAccount = null;
       
       assertEquals(true, false,() -> {
           System.out.println("This failed for sure.");
                    return "This failed for sure.";
       });
       assertFalse(false);
       assertNotEquals(acc, fakeNewAccount);
       assertNotNull(acc);
       assertTrue(true);
       assertSame(acc, acc);
       assertNotSame(fakeNewAccount, acc);
       assertNull(nullAccount);
       
   }
   
   @Test
   public void testEightDifferentAssertsWithAssertAll()
   {
       Account fakeNewAccount = new Account("Test2",2);
       Account nullAccount = null;
       
       assertAll("8diffAsserts", 
                () -> assertEquals(acc,acc),
                () -> assertFalse(false),
                () -> assertNotEquals(acc, fakeNewAccount),
                () -> assertNotNull(acc),
                () -> assertTrue(true),
                () -> assertSame(acc, acc),
                () -> assertNotSame(fakeNewAccount, acc),
                () -> assertNull(nullAccount)
               );
   }
   
   @Test
   @Disabled
   public void testEightDifferentAssertsDisabled()
   {
       Boolean randomBoolean = Math.random() < 0.5;
       
       assumeTrue(randomBoolean);
       
       Account fakeNewAccount = new Account("Test2",2);
       Account nullAccount = null;
       
       assertEquals(acc, acc);
       assertFalse(false);
       assertNotEquals(acc, fakeNewAccount);
       assertNotNull(acc);
       assertTrue(true);
       assertSame(acc, acc);
       assertNotSame(fakeNewAccount, acc);
       assertNull(nullAccount);
   }
}
