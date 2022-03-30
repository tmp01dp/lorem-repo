package com.example.lorem.repo;

import com.example.lorem.repo.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @Autowired
    MessageRepository messageRepository;

    @KafkaListener(topics = "words.processed", containerFactory = "kafkaListenerContainerFactory")
    public void processMessage(String content){
        messageRepository.save(new Message(content));
    }
}
