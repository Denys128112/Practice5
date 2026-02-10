package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PaymentProcessor {
   public void process(PaymentMethod method, int amount){
       method.name();
       method.pay(amount);
   }
}