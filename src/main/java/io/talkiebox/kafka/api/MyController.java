package io.talkiebox.kafka.api;

import io.talkiebox.kafka.model.MyMessage;
import io.talkiebox.kafka.producer.MyProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class MyController {

    private final MyProducer myProducer = new MyProducer();

    @PostMapping("/message")
    void message(@RequestBody MyMessage myMessage) {

        System.out.println("myMessage: " + myMessage);

        myProducer.sendMessage(myMessage);
    }


}
