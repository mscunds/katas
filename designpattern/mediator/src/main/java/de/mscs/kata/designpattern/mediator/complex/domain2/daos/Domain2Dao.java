package de.mscs.kata.designpattern.mediator.complex.domain2.daos;

import java.time.LocalDate;
import java.util.Optional;

import de.mscs.kata.designpattern.mediator.complex.common.daos.DaoMediator;
import de.mscs.kata.designpattern.mediator.complex.domain2.entities.Domain2Entity;
import de.mscs.kata.designpattern.mediator.complex.domain2.model.Domain2Model;
import org.springframework.stereotype.Service;

@Service
public class Domain2Dao implements DaoMediator<Domain2Entity, Domain2Model> {

    public Optional<Domain2Entity> findById(long id) {
        return Optional.of(new Domain2Entity(id, LocalDate.now().plusDays(id)));
    }

    public Domain2Entity create(Domain2Model domain2) {
        return new Domain2Entity(2L, LocalDate.now().plusDays(2));
    }

}
