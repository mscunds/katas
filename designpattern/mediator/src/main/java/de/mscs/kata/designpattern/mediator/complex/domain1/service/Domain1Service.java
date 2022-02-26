package de.mscs.kata.designpattern.mediator.complex.domain1.service;

import java.time.format.DateTimeFormatter;

import de.mscs.kata.designpattern.mediator.complex.common.daos.DaoMediator;
import de.mscs.kata.designpattern.mediator.complex.common.services.MediatedService;
import de.mscs.kata.designpattern.mediator.complex.domain1.entities.Domain1Entity;
import de.mscs.kata.designpattern.mediator.complex.domain1.model.Domain1Model;
import de.mscs.kata.designpattern.mediator.complex.domain2.entities.Domain2Entity;
import de.mscs.kata.designpattern.mediator.complex.domain2.model.Domain2Model;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class Domain1Service extends MediatedService<Domain1Entity, Domain1Model> {

    private final DaoMediator<Domain2Entity, Domain2Model> domain2Dao;

    public Domain1Service (final DaoMediator<Domain1Entity, Domain1Model> domainDao,
            final DaoMediator<Domain2Entity, Domain2Model> domain2Dao) {
        super(domainDao);
        this.domain2Dao = domain2Dao;
    }

    public void serviceOfDomain1() {
        Domain2Entity domain2 = this.domain2Dao.findById(5L).orElseThrow(()
                -> new IllegalArgumentException("Missing value for id"));

        Domain1Entity domain1Entity = getDomainDao().create(new Domain1Model(domain2.getId(),
                DateTimeFormatter.ISO_DATE.format(domain2.getValue())));
        log.info("created {}", domain1Entity);
    }
}
