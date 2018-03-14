/* (C) 2018 by Mark Sudau Consulting & Service */
package de.mscs.training.lambdas.lecture3;

/**
 * class DiceFunction.
 *
 * @author marsud
 * @since 09.03.2018
 */
@FunctionalInterface
public interface Dice {
    public int playDice(int sides, int modificator);
}
