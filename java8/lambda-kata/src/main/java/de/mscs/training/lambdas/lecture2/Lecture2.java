/* (C) 2018 by Mark Sudau Consulting & Service */
package de.mscs.training.lambdas.lecture2;

import java.util.Collection;
import java.util.Comparator;

/**
 * class Lecture1.
 *
 * @author marsud
 * @since 08.03.2018
 */
public class Lecture2 {
    
    public void execute() {
        Comparator<User> birthdaySort = (lhu, rhu) -> lhu.getBirthday().compareTo(rhu.getBirthday());
        Comparator<User> firstNameSort = (lhu, rhu) -> lhu.getFirstName().compareTo(rhu.getFirstName());
        Comparator<User> surNameSort = (lhu, rhu) -> lhu.getSurName().compareTo(rhu.getSurName());  
        
        compare(User.list(), birthdaySort);
        System.out.println();
        compare(User.list(), firstNameSort);
        System.out.println();
        compare(User.list(), surNameSort);
    }
    
    private void compare(Collection<User> userList, Comparator<User> comparator) {
        userList.stream().sorted(comparator).forEach(System.out::println);
    }
    
    /**
     * main.
     * @param args
     */
    public static void main(String[] args) {
        Lecture2 lecture1 = new Lecture2();
        
        System.out.println("\nsort a list with comparators");
        lecture1.execute();
    }
}
