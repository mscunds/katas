package de.mscs.kata.designpattern.mediator.complex.common.services;

import de.mscs.kata.designpattern.mediator.complex.common.daos.DaoMediator;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class MediatedService<D,M> {

    @Getter(value = AccessLevel.PROTECTED)
    private final DaoMediator<D,M> domainDao;

}
