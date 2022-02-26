package de.mscs.kata.designpattern.mediator.complex.domain2.entities;

import java.time.LocalDate;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Domain2Entity {
    private Long id;
    private LocalDate value;

    public Domain2Entity (final Long id, final LocalDate value) {
        this.id = id;
        this.value = value;
    }
}
