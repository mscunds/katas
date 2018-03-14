/* (C) 2018 by Mark Sudau Consulting & Service */
package de.mscs.training.lambdas.lecture3;

/**
 * class Lecture1.
 *
 * @author marsud
 * @since 08.03.2018
 */
public class Lecture3 {

    public void êxecute() {
        Dice hexaeder = (sides, modificator) -> (int)(((Math.random() * 10) % sides) + 1 + modificator);
        for (int i=0; i < 10; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(dice(6,0,hexaeder));
        }
        System.out.println();
    }
    
    private int dice(int sides, int modificatior, Dice diceFunktion) {
        return diceFunktion.playDice(sides, modificatior);
    } 
    
    /**
     * main.
     * @param args
     */
    public static void main(String[] args) {
        Lecture3 lecture1 = new Lecture3();
        
        System.out.println("\nfirst own FunctionalInterface");
        lecture1.êxecute();
    }
}
