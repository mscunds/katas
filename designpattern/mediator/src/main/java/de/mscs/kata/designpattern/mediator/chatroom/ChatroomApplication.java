package de.mscs.kata.designpattern.mediator.chatroom;

import de.mscs.kata.designpattern.mediator.chatroom.model.User;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = "de.mscs.kata.designpattern.mediator.chatroom")
public class ChatroomApplication {

    public static void main (String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(ChatroomApplication.class)
                .web(WebApplicationType.NONE)
                .allowCircularReferences(false)
                .logStartupInfo(true)
                .build().run(args);

        Chatroom chatroom = context.getBean("chatroom", Chatroom.class);

        User foo = new User("Foo");
        User bar = new User("Bar");
        chatroom.login(foo);
        chatroom.login(bar);
        chatroom.bye(bar);
        chatroom.bye(foo);
    }
}
