package org.example;

public class MultiNotifier implements EmailNotifier,SmsNotifier{

    @Override
    public void send() {
        EmailNotifier.super.send();
        SmsNotifier.super.send();
    }
}
