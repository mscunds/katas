package de.mscs.katas.lecture1.hibernate;

import java.util.List;
import java.util.Optional;

import lombok.NoArgsConstructor;
import org.hibernate.Session;
import org.hibernate.query.Query;

@NoArgsConstructor
public class TodoRepository {

    public Optional<Todo> getTodo(long id) {
        Session session = getSession();
        Query<Todo> query = session.createNamedQuery(Todo.NQ_FIND_BY_ID, Todo.class);
        query.setParameter("id", id);
        return query.uniqueResultOptional();
    }

    public List<Todo> findAll() {
        Session session = getSession();
        Query<Todo> query = session.createQuery("select todo from Todo todo", Todo.class);
        return query.getResultList();
    }

    public void persist(Todo value) {
        Session session = getSession();
        session.beginTransaction();
        session.saveOrUpdate(value);
        session.getTransaction().commit();
    }

    private Session getSession() {
        Session currentSession = HibernateSessionFactoryFactory.getSessionFactory().getCurrentSession();
        if (currentSession == null) {
            currentSession = HibernateSessionFactoryFactory.getSessionFactory().openSession();
        }
        return currentSession;
    }
}
