package de.mscs.katas.lecture1.hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import java.io.Serializable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "todos")
@NoArgsConstructor
@Getter
@ToString
@NamedQuery(name = Todo.NQ_FIND_BY_ID, query = "select todo from Todo todo where id = :id")
public class Todo implements Serializable {

    public static final String NQ_FIND_BY_ID = "findById";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;
    private String title;

    public Todo (final String title) {
        this.title = title;
    }
}
