package de.mscs.kata.designpattern.decorator.wrapper;

import java.time.Instant;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
public class SimpleDecorator implements Decorator {
    private final Instant createdAt;
    @Setter
    private Instant finishedAt;
    private final String title;
}
