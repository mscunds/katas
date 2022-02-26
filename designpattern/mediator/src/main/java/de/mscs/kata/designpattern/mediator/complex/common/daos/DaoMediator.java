package de.mscs.kata.designpattern.mediator.complex.common.daos;

import java.util.Optional;

public interface DaoMediator<D, M> {
    Optional<D> findById(long id);
    D create(M domain1);
}
