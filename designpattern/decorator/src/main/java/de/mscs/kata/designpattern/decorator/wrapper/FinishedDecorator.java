package de.mscs.kata.designpattern.decorator.wrapper;

import java.time.Instant;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class FinishedDecorator implements Decorator {
    private final Decorator decoratedItem;

    @Override public Instant getCreatedAt () {
        return decoratedItem.getCreatedAt();
    }

    @Override public Instant getFinishedAt () {
        return decoratedItem.getFinishedAt();
    }

    @Override public void setFinishedAt (final Instant endDate) {
        throw new UnsupportedOperationException("Not implemented yet!");
    }

    @Override public String getTitle () {
        return decoratedItem.getTitle() + " (FinishedWrapper)";
    }

    public boolean isFinished () {
        return decoratedItem.getFinishedAt() != null
                && decoratedItem.getFinishedAt().isBefore(Instant.now());
    }

}
