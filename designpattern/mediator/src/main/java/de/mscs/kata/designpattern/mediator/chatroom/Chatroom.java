package de.mscs.kata.designpattern.mediator.chatroom;

import java.util.ArrayList;
import java.util.List;

import de.mscs.kata.designpattern.mediator.chatroom.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
class Chatroom {

    private final List<User> participants = new ArrayList<>();

    public void login(User newUser) {
        if (!participants.contains(newUser)) {
            participants.add(newUser);
            log.info("{} enters the room.", newUser.getName());
            if (participants.size() > 1) {
                newUser.say("Hi all!");
            }
        }
    }

    public void bye(User leavingUser) {
        if (participants.size() > 1) {
            leavingUser.say("Bye folks!");
        }
        log.info("{} leaves the room.", leavingUser.getName());
        participants.remove(leavingUser);
    }
}
