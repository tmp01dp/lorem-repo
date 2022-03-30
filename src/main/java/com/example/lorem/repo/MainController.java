package com.example.lorem.repo;

import com.example.lorem.repo.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class MainController {

    @Autowired
    MessageRepository messageRepository;

    @GetMapping
    @RequestMapping(value = "/betvictor/history")
    public List<String> getMessages() {
        List<Message> res = messageRepository.findMessages();
        return res.stream().map(v -> v.getData()).collect(Collectors.toList());
    }
}
