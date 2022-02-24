package de.mscs.kata.designpattern.mediator;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class MediatorApp {

    public static void main (String[] args) {
        new SpringApplicationBuilder(MediatorApp.class)
                .web(WebApplicationType.NONE)
                .allowCircularReferences(false)
                .logStartupInfo(true)
                .build().run(args);

    }
}
