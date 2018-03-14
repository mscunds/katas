/* (C) 2018 by Mark Sudau Consulting & Service */
package de.mscs.training.lambdas.lecture2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * class User.
 *
 * @author marsud
 * @since 09.03.2018
 */
/**
 * class User.
 *
 * @author marsud
 * @since 09.03.2018
 */
public class User {
    
    private static final User JOHN_DOE = new User("John","Doe", "1959-04-01");
    private static final User JANE_DOE = new User("Jane","Doe", "1962-03-11");
    private static final User MAX_MUSTERMANN = new User("Max", "Mustermann", "1961-12-31");
    
    public static List<User> list() {
        return new ArrayList<>(Arrays.asList(JOHN_DOE, JANE_DOE, MAX_MUSTERMANN));
    }
    
    private String firstName;
    private String surName;
    private LocalDate birthday;
    
    public User(String firstName, String surName, LocalDate birthday) {
        this.firstName = firstName;
        this.surName = surName;
        this.birthday = birthday;
    }
    
    public User(String firstName, String surName, String birthday) {
        this(firstName, surName, LocalDate.parse(birthday, DateTimeFormatter.ISO_LOCAL_DATE));
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("User [firstName=");
        builder.append(firstName);
        builder.append(", surName=");
        builder.append(surName);
        builder.append(", birthday=");
        builder.append(birthday);
        builder.append("]");
        return builder.toString();
    }
}
