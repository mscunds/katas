/* (C) 2018 by Mark Sudau Consulting & Service */
package de.mscs.training.lambdas.lecture1;

/**
 * class Lecture1.
 *
 * @author marsud
 * @since 08.03.2018
 */
public class Lecture1 {
    
    public void execute() {
        Runnable runnable = () -> System.out.println("Ich bin das erste Lambda");
        runnable.run();
    }
    
    /**
     * main.
     * @param args
     */
    public static void main(String[] args) {
        Lecture1 lecture1 = new Lecture1();
        
        System.out.println("\nStart a thread with lambdas");
        lecture1.execute();
    }
}
