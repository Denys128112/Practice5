package org.example;

interface PaymentMethod {
    void name();
    void pay(int amount);
    default void payWithFee(int amount, int fee){
        if (amount-fee>0){
            System.out.println("You payed"+(amount-fee)+"because of fee");
        }
    }
}
