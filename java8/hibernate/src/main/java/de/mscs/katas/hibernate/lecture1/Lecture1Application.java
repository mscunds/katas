package de.mscs.katas.hibernate.lecture1;

import java.util.logging.Logger;

import org.hibernate.SessionFactory;

public class Lecture1Application {

    private static final Logger LOG = Logger.getLogger("Lecture1");

    public static void main (String[] args) {
        Lecture1Application application = new Lecture1Application();
        application.createSessionFactory();
        application.createSessionFactory();
        application.createSessionFactory();
    }

    @SuppressWarnings(value = "squid:S106")
    private void createSessionFactory() {
        SessionFactory sessionFactory = HibernateSessionFactoryFactory.getSessionFactory();
        LOG.info("Session Factory: " + sessionFactory.hashCode()); //NOSONAR
    }
}