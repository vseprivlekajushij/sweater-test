package com.example.sweater.repos;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

import com.example.sweater.domain.Message;

public interface MessageRepo extends CrudRepository<Message, Long> {

    List<Message> findByTag(String tag);

}
