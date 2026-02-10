package org.example;

public class DailyReport extends ReportGenerator{
    @Override
    public void greetings(){
        System.out.println("Hello");
    }

    @Override
    public void report() {
        System.out.println("Report was generated");
    }

}
