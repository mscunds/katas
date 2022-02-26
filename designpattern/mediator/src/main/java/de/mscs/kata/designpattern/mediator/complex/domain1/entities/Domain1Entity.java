package de.mscs.kata.designpattern.mediator.complex.domain1.entities;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Domain1Entity {
    private Long id;
    private String value;

    public Domain1Entity (final Long id, final String value) {
        this.id = id;
        this.value = value;
    }
}
