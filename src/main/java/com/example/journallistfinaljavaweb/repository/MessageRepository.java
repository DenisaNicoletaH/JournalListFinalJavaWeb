package com.example.journallistfinaljavaweb.repository;
import com.example.journallistfinaljavaweb.entity.Message;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepository extends CrudRepository<Message,Long> {

    List<Message> findAllByFriendId(long id);

    @Transactional
void deleteAllByFriendId(long friendId);
}
