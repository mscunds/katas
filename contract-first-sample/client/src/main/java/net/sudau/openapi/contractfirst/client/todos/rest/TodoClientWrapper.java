package net.sudau.openapi.contractfirst.client.todos.rest;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.sudau.openapi.contractfirst.api.models.Aufgabe;
import net.sudau.openapi.contractfirst.api.models.Aufgabenliste;
import net.sudau.openapi.contractfirst.api.models.PageInfo;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class TodoClientWrapper {

    private final TodoClient todoClient;

    public Aufgabenliste holeAufgaben() {
        return todoClient.liesAufgaben(new PageInfo().page(Integer.valueOf(2)).contentCount(Integer.valueOf(35)))
                .getBody();
    }

    public Aufgabe erzeugeAufgabe(Aufgabe neueAufgabe) {
        return todoClient.erzeugeAufgabe(neueAufgabe).getBody();
    }

    public Aufgabe liesAufgabezuId(int id) {
        return todoClient.todoDetails(Integer.valueOf(id)).getBody();
    }
}
