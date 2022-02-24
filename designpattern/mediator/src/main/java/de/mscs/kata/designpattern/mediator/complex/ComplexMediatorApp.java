package de.mscs.kata.designpattern.mediator.complex;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = "de.mscs.kata.designpattern.mediator.complex")
public class ComplexMediatorApp {

    public static void main (String[] args) {
        /*ConfigurableApplicationContext context = */
        new SpringApplicationBuilder(ComplexMediatorApp.class)
                .web(WebApplicationType.NONE)
                .allowCircularReferences(false)
                .logStartupInfo(true)
                .build().run(args);

    }
    }
}
