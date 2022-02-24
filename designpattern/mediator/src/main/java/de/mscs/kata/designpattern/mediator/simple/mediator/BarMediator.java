package de.mscs.kata.designpattern.mediator.simple.mediator;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier ("barMediator")
@Slf4j
public class BarMediator implements Mediator {
    public void findOne () {
        log.info("{} - findOne", this.getClass().getSimpleName());
    }

    public void findAll () {
        log.info("{} - findAll", this.getClass().getSimpleName());
    }
}
