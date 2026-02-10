package org.example;

public class PaymentUser {
    public static void main(String[] args) {
        run();
    }
    public static void run(){
        CardPayment card=new CardPayment();
        PayPalMethod paypal=new PayPalMethod();
        PaymentProcessor processor=new PaymentProcessor();
        processor.process(card,200);
        processor.process(paypal,200);
        card.payWithFee(200,100);
    }
}
