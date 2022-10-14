package de.mscs.kata.designpattern.decorator.wrapper;

import java.time.Duration;
import java.time.Instant;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AgeDecorator implements Decorator {
    private final Decorator decoratedItem;

    @Override public Instant getCreatedAt () {
        return decoratedItem.getCreatedAt();
    }

    @Override public Instant getFinishedAt () {
        return decoratedItem.getFinishedAt();
    }

    @Override public void setFinishedAt (final Instant endDate) {
        decoratedItem.setFinishedAt(endDate);
    }

    @Override public String getTitle () {
        return decoratedItem.getTitle() + " (AgeWrapper)";
    }

    public Duration getAge() {
        return Duration.between(decoratedItem.getCreatedAt(), Instant.now());
    }
}
