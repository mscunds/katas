package de.mscs.kata.designpattern.mediator.simple.service;

import de.mscs.kata.designpattern.mediator.simple.mediator.Mediator;
import org.springframework.beans.factory.annotation.Qualifier;

@org.springframework.stereotype.Service
public class SimpleService implements Service {

    private final Mediator mediator;

    public SimpleService (@Qualifier ("simpleMediator") final Mediator mediator) {
        this.mediator = mediator;
    }

    public void someAction() {
        mediator.findOne();
    }

}
