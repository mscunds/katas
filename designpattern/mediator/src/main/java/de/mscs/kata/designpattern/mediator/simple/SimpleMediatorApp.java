package de.mscs.kata.designpattern.mediator.simple;

import de.mscs.kata.designpattern.mediator.simple.service.ComplexService;
import de.mscs.kata.designpattern.mediator.simple.service.SimpleService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = "de.mscs.kata.designpattern.mediator.simple")
public class SimpleMediatorApp {

    public static void main (String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(SimpleMediatorApp.class)
                .web(WebApplicationType.NONE)
                .allowCircularReferences(false)
                .logStartupInfo(true)
                .build().run(args);

        ComplexService complexService = context.getBean(ComplexService.class);
        SimpleService simpleService = context.getBean(SimpleService.class);

        simpleService.someAction();
        complexService.someAction();

    }
}
