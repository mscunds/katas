package net.sudau.openapi.contractfirst.server.todos.rest;

import lombok.extern.slf4j.Slf4j;
import net.sudau.openapi.contractfirst.api.models.Aufgabe;
import net.sudau.openapi.contractfirst.api.models.Aufgabenliste;
import net.sudau.openapi.contractfirst.api.models.PageInfo;
import net.sudau.openapi.contractfirst.api.server.TodoApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(value = "http://localhost:*")
@RestController
@RequestMapping("/sample")
@Slf4j
public class ToDoEndpoint implements TodoApi {

    @Override public ResponseEntity<Aufgabe> erzeugeAufgabe (final Aufgabe aufgabe) {
        log.info("erzeuge Aufgabe {}.", aufgabe);
        return ResponseEntity.ok(aufgabe);
    }

    @Override public ResponseEntity<Aufgabenliste> liesAufgaben (final PageInfo pageInfo) {
        log.info("Hole Aufgabenliste für {}.", pageInfo);
        return ResponseEntity.ok(new Aufgabenliste());
    }

    @Override public ResponseEntity<Aufgabe> todoDetails (final Integer id) {
        log.info("hole Aufgabendetails zu Aufgabe {}", id);
        return ResponseEntity.ok(new Aufgabe());
    }
}
