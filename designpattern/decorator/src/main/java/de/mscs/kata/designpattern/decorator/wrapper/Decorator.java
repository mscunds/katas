package de.mscs.kata.designpattern.decorator.wrapper;

import java.time.Instant;

interface Decorator {

    Instant getCreatedAt ();

    Instant getFinishedAt ();

    void setFinishedAt (final Instant endDate);

    String getTitle ();

}
