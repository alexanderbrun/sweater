package ru.zigzag55.repos;

import org.springframework.data.repository.CrudRepository;
import ru.zigzag55.domain.Message;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Integer> {
    List<Message> findByTag(String tag);
}