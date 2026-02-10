package org.example;


public abstract class ReportGenerator {
    public final void generate(){
        greetings();
        report();
    }
    abstract public  void greetings();
    abstract public  void report();

}
