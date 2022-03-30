package com.example.lorem.repo;

import com.example.lorem.repo.model.Message;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepository extends CrudRepository<Message, String> {

    @Query("select * from messages order by datetime desc limit 10")
    List<Message> findMessages();

}
