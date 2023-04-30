package de.mscs.katas.lecture2.hibernate;

import org.hibernate.SessionFactory;

public class ToDoDao {
    private final SessionFactory sessionFactory;

    public ToDoDao (final SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


}
