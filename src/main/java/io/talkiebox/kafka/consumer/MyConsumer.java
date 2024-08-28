package io.talkiebox.kafka.consumer;

import io.talkiebox.kafka.model.MyMessage;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component
public class MyConsumer implements Consumer<Message<MyMessage>> {

    public MyConsumer() {
        System.out.println("MyConsumer init!");
    }

    @Override
    public void accept(Message<MyMessage> message) {
        System.out.println("Message arrived! - " + message.getPayload());
    }
}
