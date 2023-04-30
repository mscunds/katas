package net.sudau.openapi.contractfirst.client.todos.rest;

import java.util.Map;

import lombok.RequiredArgsConstructor;
import net.sudau.openapi.contractfirst.api.models.Aufgabe;
import net.sudau.openapi.contractfirst.api.models.Aufgabenliste;
import net.sudau.openapi.contractfirst.api.models.PageInfo;
import net.sudau.openapi.contractfirst.api.server.TodoApi;
import org.springframework.boot.autoconfigure.web.client.RestTemplateAutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class TodoClient implements TodoApi {

    private final RestTemplate restTemplate;

    @Override public ResponseEntity<Aufgabe> erzeugeAufgabe (final Aufgabe aufgabe) {
        return restTemplate.postForEntity("/todos", aufgabe, Aufgabe.class);
    }

    @Override public org.springframework.http.ResponseEntity<Aufgabenliste> liesAufgaben (final PageInfo pageInfo) {
        return restTemplate.getForEntity("/todos", Aufgabenliste.class);
    }

    @Override public org.springframework.http.ResponseEntity<Aufgabe> todoDetails (final Integer id) {
        return restTemplate.getForEntity("/todos/{id}", Aufgabe.class, Map.of("id", id));
    }
}
