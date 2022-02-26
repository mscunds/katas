package de.mscs.kata.designpattern.mediator.complex.domain1.model;

import lombok.Value;

@Value
public class Domain1Model {

    Long id;
    String value;

    public boolean isNew() {
        return id == null;
    }
}
