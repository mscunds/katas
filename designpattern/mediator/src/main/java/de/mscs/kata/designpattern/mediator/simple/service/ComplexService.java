package de.mscs.kata.designpattern.mediator.simple.service;

import de.mscs.kata.designpattern.mediator.simple.mediator.Mediator;
import org.springframework.beans.factory.annotation.Qualifier;

@org.springframework.stereotype.Service
public class ComplexService implements Service {

    private final Mediator fooMediator;
    private final Mediator barMediator;

    public ComplexService (@Qualifier ("fooMediator") final Mediator fooMEdiator,
            @Qualifier ("barMediator") final Mediator barMediator) {
        this.barMediator = barMediator;
        this.fooMediator = fooMEdiator;
    }

    public void someAction() {
        barMediator.findAll();
        fooMediator.findOne();
    }

}
