package org.example;

public interface SmsNotifier {
    default void send(){
        System.out.println("Sms was sent");
    }
}
