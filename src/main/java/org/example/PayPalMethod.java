package org.example;

public class PayPalMethod implements PaymentMethod{
    @Override
    public void name() {
        System.out.println("PayPalPayment was chossen");
    }

    @Override
    public void pay(int amount) {
        if(amount>0)
            System.out.println("You payed by paypal"+amount);
    }
}
