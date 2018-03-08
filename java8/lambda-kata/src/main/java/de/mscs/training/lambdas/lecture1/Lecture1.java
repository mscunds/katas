/* (C) 2018 by Mark Sudau Consulting & Service */
package de.mscs.training.lambdas.lecture1;

/**
 * class Lecture1.
 *
 * @author marsud
 * @since 08.03.2018
 */
public class Lecture1 {
    
    public void firstLambda() {
        Runnable runnable = () -> System.out.println("Ich bin das erste Lambda");
        runnable.run();
    }
    
    /**
     * main.
     * @param args
     */
    public static void main(String[] args) {
        new Lecture1().firstLambda();
    }
}
