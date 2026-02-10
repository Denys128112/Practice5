package org.example;

public class CardPayment implements PaymentMethod{
    @Override
    public void name() {
        System.out.println("CardPayment was chossen");
    }

    @Override
    public void pay(int amount) {
        if(amount>0)
            System.out.println("You payed by card"+amount);
    }
}
