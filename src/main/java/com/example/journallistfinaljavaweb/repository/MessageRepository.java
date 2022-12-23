package com.example.journallistfinaljavaweb.repository;
import com.example.journallistfinaljavaweb.entity.Message;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepository extends CrudRepository<Message,Long> {
/*
public List<Message> findAllByMessage(String FindMessage);

@Transactional
void deleteAllById(long user_Id);
*/

}
