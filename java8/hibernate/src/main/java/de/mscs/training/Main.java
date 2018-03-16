/* (C) 2018 by Mark Sudau Consulting & Service */
package de.mscs.training;

import de.mscs.training.domain.User;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * class Main.
 *
 * @author marsud
 * @since 16.03.2018
 */
public class Main {
    
    private Main() {}
    
    public static void main(String[] args) throws Exception{
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(User.class)
                .buildSessionFactory();
        
        factory.openSession();
        factory.close();
    }
}
