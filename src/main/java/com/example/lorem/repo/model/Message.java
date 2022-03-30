package com.example.lorem.repo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Date;

@Table("MESSAGES")
public class Message {
    @Id
    String id;
    String data;
    Date datetime;

    @PersistenceConstructor
    public Message(String id, String data, Date datetime) {
        this.id = id;
        this.data = data;
        this.datetime = datetime;
    }

    public Message(String data) {
        this.data = data;
        this.datetime = new Date();
    }

    public String getData() {
        return data;
    }
}
