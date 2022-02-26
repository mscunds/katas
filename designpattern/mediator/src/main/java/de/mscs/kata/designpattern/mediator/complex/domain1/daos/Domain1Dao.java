package de.mscs.kata.designpattern.mediator.complex.domain1.daos;

import java.util.Optional;

import de.mscs.kata.designpattern.mediator.complex.common.daos.DaoMediator;
import de.mscs.kata.designpattern.mediator.complex.domain1.entities.Domain1Entity;
import de.mscs.kata.designpattern.mediator.complex.domain1.model.Domain1Model;
import org.springframework.stereotype.Service;

@Service
public class Domain1Dao implements DaoMediator<Domain1Entity, Domain1Model> {

    public Optional<Domain1Entity> findById(long id) {
        return Optional.of(new Domain1Entity(id, String.format("value of entity with id %d", id)));
    }

    public Domain1Entity create(Domain1Model domain1) {
        return new Domain1Entity(domain1.getId(), domain1.getValue());
    }
}
