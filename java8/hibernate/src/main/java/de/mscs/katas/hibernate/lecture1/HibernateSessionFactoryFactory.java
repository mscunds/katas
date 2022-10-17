package de.mscs.katas.hibernate.lecture1;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public final class HibernateSessionFactoryFactory {

    private static SessionFactory factory;

    private HibernateSessionFactoryFactory () {}

    public static synchronized SessionFactory getSessionFactory () {
        if (factory == null) {
            factory = new Configuration().configure("de/mscs/katas/hibernate/lecture1/hibernate.cfg.xml")
                                         .buildSessionFactory();
        }
        return factory;
    }

    public static void shutdown () {
        if (!factory.isClosed()) {
            factory.close();
        }
        factory = null;
    }
}
