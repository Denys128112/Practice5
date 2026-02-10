package org.example;

public interface EmailNotifier {
    default  void send(){
        System.out.println("Email was sent");
    }
}
