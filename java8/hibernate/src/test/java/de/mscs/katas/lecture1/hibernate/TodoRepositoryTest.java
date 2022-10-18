package de.mscs.katas.lecture1.hibernate;


import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

class TodoRepositoryTest {

    private static final Logger log = Logger.getLogger(TodoRepositoryTest.class.getSimpleName());

    @Test
    void sample() {
        List<Todo> todos = Arrays.asList(
                new Todo("todo1"),
                new Todo("todo2"),
                new Todo("todo3")
        );
        log.info("Testliste: " + todos);
        TodoRepository repo = new TodoRepository();
        todos.forEach(repo::persist);

        List<Todo> actuals = repo.findAll();
        log.info("liste aus der DB: " + actuals);

        assertThat(actuals)
                .hasSize(3)
                .extracting("title")
                .contains("todo1","todo2","todo3");

        assertThat(repo.getTodo(actuals.get(1).getId()))
                .isPresent()
                .get()
                .isEqualTo(actuals.get(1));
    }

}
