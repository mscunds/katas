package de.mscs.kata.designpattern.mediator.complex;

import de.mscs.kata.designpattern.mediator.complex.domain1.service.Domain1Service;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication (scanBasePackages = "de.mscs.kata.designpattern.mediator.complex")
public class ComplexMediatorApp {

    public static void main (String[] args) {
        ConfigurableApplicationContext context =
                new SpringApplicationBuilder(ComplexMediatorApp.class)
                        .web(WebApplicationType.NONE)
                        .allowCircularReferences(false)
                        .logStartupInfo(true)
                        .build().run(args);

        Domain1Service domain1 = context.getBean(Domain1Service.class);

        domain1.serviceOfDomain1();

    }
}
