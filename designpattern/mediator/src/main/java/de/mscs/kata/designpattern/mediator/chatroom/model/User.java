package de.mscs.kata.designpattern.mediator.chatroom.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
public class User {
    @Getter
    private final String name;

    public void say(final String message) {
        log.info("{}: {}", name, message);
    }
}
