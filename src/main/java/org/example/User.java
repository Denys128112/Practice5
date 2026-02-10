package org.example;

public class User {
    public static void main(String[] args) {
        DailyReport report=new DailyReport();
        report.generate();
        MultiNotifier notifier=new MultiNotifier();
        notifier.send();
    }
}
